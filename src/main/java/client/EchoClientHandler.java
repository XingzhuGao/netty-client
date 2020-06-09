package client;

import com.example.entities.ClientServerMessageHeader;
import com.example.entities.Platform;
import com.example.req.TestParam;
import com.google.protobuf.GeneratedMessageV3;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;

//不同Channel之间共享此Handler
@ChannelHandler.Sharable
public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {

        ClientServerMessageHeader.Builder builder = ClientServerMessageHeader.newBuilder();
        builder.setTokenId("tokenId");
        builder.setService("test");
        builder.setPlatform(Platform.IOS);
        builder.setCompressed("no");
        builder.setHasShard(false);
        builder.setHasVersion(false);
        builder.setIgnoreMaintenance(true);
        builder.setShard("shard");

        TestParam.Builder testBuilder = TestParam.newBuilder();
        testBuilder.setId(1000);
        testBuilder.setUserId("ksindg_nding_12kdsn");
        //连接成功后向服务端发送数据
        ctx.writeAndFlush(Unpooled.wrappedBuffer(encode(builder.build(), testBuilder.build())));
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {
        //打印从服务端收到的数据，然后关闭连接

        System.out.println(msg);
        System.out.println("Received from server: " + msg.getCharSequence(0, msg.readableBytes(), CharsetUtil.UTF_8));
        ctx.close();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        //打印遇到的异常，然后关闭连接
        cause.printStackTrace();
        ctx.close();
    }

    public <H, B> byte[] encode(H header, B body) {

        byte[] headerData = getBytes(header); // 头部数据

        byte[] payload = getBytes(body); // 头部数据

        int hlen = headerData.length; // 头部数据长度

        byte[] headerLenData = intToByteArray(hlen); // 头部数据长度数据

        int hdlen = headerLenData.length; // 头部数据长度数据长度

        int plen = payload.length;
        byte[] payloadLenData = intToByteArray(plen); // 头部数据长度数据
        int pdlen = payloadLenData.length;

        byte[] data = new byte[hlen + hdlen + pdlen + plen];

        System.arraycopy(headerLenData, 0, data, 0, headerLenData.length); // 头部长度数据

        System.arraycopy(headerData, 0, data, headerLenData.length, headerData.length); // 头部数据

        // 包体长度数据
        System.arraycopy(payloadLenData, 0, data, headerLenData.length + headerData.length, payloadLenData.length);

        // 包体数据
        System.arraycopy(payload, 0, data, headerLenData.length + headerData.length + payloadLenData.length, payload.length);

        return data;
    }

    public <T> byte[] getBytes(T obj) {

        GeneratedMessageV3 message = (GeneratedMessageV3) obj;
        return message.toByteArray();
    }

    public static byte[] intToByteArray(int value) {
        return new byte[]{
                (byte) (value >>> 24),
                (byte) (value >>> 16),
                (byte) (value >>> 8),
                (byte) value};
    }
}

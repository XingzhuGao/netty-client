package client;

import com.example.entities.ClientServerMessageHeader;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientServerMessage {

    private ClientServerMessageHeader header;

    private byte[] payload;
}

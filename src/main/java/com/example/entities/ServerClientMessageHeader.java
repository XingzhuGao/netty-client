// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model.proto

package com.example.entities;

/**
 * Protobuf type {@code com.proto.ServerClientMessageHeader}
 */
public  final class ServerClientMessageHeader extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.proto.ServerClientMessageHeader)
    ServerClientMessageHeaderOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ServerClientMessageHeader.newBuilder() to construct.
  private ServerClientMessageHeader(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ServerClientMessageHeader() {
    version_ = "";
    timestamp_ = 0L;
    tokenId_ = "";
    newVersion_ = "";
    compressed_ = false;
    status_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ServerClientMessageHeader(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            version_ = s;
            break;
          }
          case 16: {

            timestamp_ = input.readInt64();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            tokenId_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            newVersion_ = s;
            break;
          }
          case 40: {

            compressed_ = input.readBool();
            break;
          }
          case 48: {
            int rawValue = input.readEnum();

            status_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.entities.Model.internal_static_com_proto_ServerClientMessageHeader_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.entities.Model.internal_static_com_proto_ServerClientMessageHeader_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.entities.ServerClientMessageHeader.class, com.example.entities.ServerClientMessageHeader.Builder.class);
  }

  public static final int VERSION_FIELD_NUMBER = 1;
  private volatile java.lang.Object version_;
  /**
   * <code>string version = 1;</code>
   */
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      version_ = s;
      return s;
    }
  }
  /**
   * <code>string version = 1;</code>
   */
  public com.google.protobuf.ByteString
      getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      version_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 2;
  private long timestamp_;
  /**
   * <code>int64 timestamp = 2;</code>
   */
  public long getTimestamp() {
    return timestamp_;
  }

  public static final int TOKENID_FIELD_NUMBER = 3;
  private volatile java.lang.Object tokenId_;
  /**
   * <code>string tokenId = 3;</code>
   */
  public java.lang.String getTokenId() {
    java.lang.Object ref = tokenId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tokenId_ = s;
      return s;
    }
  }
  /**
   * <code>string tokenId = 3;</code>
   */
  public com.google.protobuf.ByteString
      getTokenIdBytes() {
    java.lang.Object ref = tokenId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tokenId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEWVERSION_FIELD_NUMBER = 4;
  private volatile java.lang.Object newVersion_;
  /**
   * <code>string newVersion = 4;</code>
   */
  public java.lang.String getNewVersion() {
    java.lang.Object ref = newVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      newVersion_ = s;
      return s;
    }
  }
  /**
   * <code>string newVersion = 4;</code>
   */
  public com.google.protobuf.ByteString
      getNewVersionBytes() {
    java.lang.Object ref = newVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      newVersion_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMPRESSED_FIELD_NUMBER = 5;
  private boolean compressed_;
  /**
   * <code>bool compressed = 5;</code>
   */
  public boolean getCompressed() {
    return compressed_;
  }

  public static final int STATUS_FIELD_NUMBER = 6;
  private int status_;
  /**
   * <code>.com.proto.GatewayStatus status = 6;</code>
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.com.proto.GatewayStatus status = 6;</code>
   */
  public com.example.entities.GatewayStatus getStatus() {
    @SuppressWarnings("deprecation")
    com.example.entities.GatewayStatus result = com.example.entities.GatewayStatus.valueOf(status_);
    return result == null ? com.example.entities.GatewayStatus.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getVersionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, version_);
    }
    if (timestamp_ != 0L) {
      output.writeInt64(2, timestamp_);
    }
    if (!getTokenIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, tokenId_);
    }
    if (!getNewVersionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, newVersion_);
    }
    if (compressed_ != false) {
      output.writeBool(5, compressed_);
    }
    if (status_ != com.example.entities.GatewayStatus.GW_OK.getNumber()) {
      output.writeEnum(6, status_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getVersionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, version_);
    }
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, timestamp_);
    }
    if (!getTokenIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, tokenId_);
    }
    if (!getNewVersionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, newVersion_);
    }
    if (compressed_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, compressed_);
    }
    if (status_ != com.example.entities.GatewayStatus.GW_OK.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(6, status_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.entities.ServerClientMessageHeader)) {
      return super.equals(obj);
    }
    com.example.entities.ServerClientMessageHeader other = (com.example.entities.ServerClientMessageHeader) obj;

    boolean result = true;
    result = result && getVersion()
        .equals(other.getVersion());
    result = result && (getTimestamp()
        == other.getTimestamp());
    result = result && getTokenId()
        .equals(other.getTokenId());
    result = result && getNewVersion()
        .equals(other.getNewVersion());
    result = result && (getCompressed()
        == other.getCompressed());
    result = result && status_ == other.status_;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (37 * hash) + TOKENID_FIELD_NUMBER;
    hash = (53 * hash) + getTokenId().hashCode();
    hash = (37 * hash) + NEWVERSION_FIELD_NUMBER;
    hash = (53 * hash) + getNewVersion().hashCode();
    hash = (37 * hash) + COMPRESSED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCompressed());
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.entities.ServerClientMessageHeader parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.entities.ServerClientMessageHeader parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.entities.ServerClientMessageHeader parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.entities.ServerClientMessageHeader parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.entities.ServerClientMessageHeader parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.entities.ServerClientMessageHeader parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.entities.ServerClientMessageHeader parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.entities.ServerClientMessageHeader parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.entities.ServerClientMessageHeader parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.entities.ServerClientMessageHeader parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.entities.ServerClientMessageHeader parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.entities.ServerClientMessageHeader parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.entities.ServerClientMessageHeader prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.proto.ServerClientMessageHeader}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.proto.ServerClientMessageHeader)
      com.example.entities.ServerClientMessageHeaderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.entities.Model.internal_static_com_proto_ServerClientMessageHeader_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.entities.Model.internal_static_com_proto_ServerClientMessageHeader_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.entities.ServerClientMessageHeader.class, com.example.entities.ServerClientMessageHeader.Builder.class);
    }

    // Construct using com.example.entities.ServerClientMessageHeader.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      version_ = "";

      timestamp_ = 0L;

      tokenId_ = "";

      newVersion_ = "";

      compressed_ = false;

      status_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.entities.Model.internal_static_com_proto_ServerClientMessageHeader_descriptor;
    }

    @java.lang.Override
    public com.example.entities.ServerClientMessageHeader getDefaultInstanceForType() {
      return com.example.entities.ServerClientMessageHeader.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.entities.ServerClientMessageHeader build() {
      com.example.entities.ServerClientMessageHeader result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.entities.ServerClientMessageHeader buildPartial() {
      com.example.entities.ServerClientMessageHeader result = new com.example.entities.ServerClientMessageHeader(this);
      result.version_ = version_;
      result.timestamp_ = timestamp_;
      result.tokenId_ = tokenId_;
      result.newVersion_ = newVersion_;
      result.compressed_ = compressed_;
      result.status_ = status_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.entities.ServerClientMessageHeader) {
        return mergeFrom((com.example.entities.ServerClientMessageHeader)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.entities.ServerClientMessageHeader other) {
      if (other == com.example.entities.ServerClientMessageHeader.getDefaultInstance()) return this;
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
        onChanged();
      }
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
      }
      if (!other.getTokenId().isEmpty()) {
        tokenId_ = other.tokenId_;
        onChanged();
      }
      if (!other.getNewVersion().isEmpty()) {
        newVersion_ = other.newVersion_;
        onChanged();
      }
      if (other.getCompressed() != false) {
        setCompressed(other.getCompressed());
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.example.entities.ServerClientMessageHeader parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.entities.ServerClientMessageHeader) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object version_ = "";
    /**
     * <code>string version = 1;</code>
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string version = 1;</code>
     */
    public com.google.protobuf.ByteString
        getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string version = 1;</code>
     */
    public Builder setVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string version = 1;</code>
     */
    public Builder clearVersion() {
      
      version_ = getDefaultInstance().getVersion();
      onChanged();
      return this;
    }
    /**
     * <code>string version = 1;</code>
     */
    public Builder setVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      version_ = value;
      onChanged();
      return this;
    }

    private long timestamp_ ;
    /**
     * <code>int64 timestamp = 2;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>int64 timestamp = 2;</code>
     */
    public Builder setTimestamp(long value) {
      
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 timestamp = 2;</code>
     */
    public Builder clearTimestamp() {
      
      timestamp_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object tokenId_ = "";
    /**
     * <code>string tokenId = 3;</code>
     */
    public java.lang.String getTokenId() {
      java.lang.Object ref = tokenId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tokenId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string tokenId = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTokenIdBytes() {
      java.lang.Object ref = tokenId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tokenId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string tokenId = 3;</code>
     */
    public Builder setTokenId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tokenId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string tokenId = 3;</code>
     */
    public Builder clearTokenId() {
      
      tokenId_ = getDefaultInstance().getTokenId();
      onChanged();
      return this;
    }
    /**
     * <code>string tokenId = 3;</code>
     */
    public Builder setTokenIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tokenId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object newVersion_ = "";
    /**
     * <code>string newVersion = 4;</code>
     */
    public java.lang.String getNewVersion() {
      java.lang.Object ref = newVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        newVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string newVersion = 4;</code>
     */
    public com.google.protobuf.ByteString
        getNewVersionBytes() {
      java.lang.Object ref = newVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        newVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string newVersion = 4;</code>
     */
    public Builder setNewVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      newVersion_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string newVersion = 4;</code>
     */
    public Builder clearNewVersion() {
      
      newVersion_ = getDefaultInstance().getNewVersion();
      onChanged();
      return this;
    }
    /**
     * <code>string newVersion = 4;</code>
     */
    public Builder setNewVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      newVersion_ = value;
      onChanged();
      return this;
    }

    private boolean compressed_ ;
    /**
     * <code>bool compressed = 5;</code>
     */
    public boolean getCompressed() {
      return compressed_;
    }
    /**
     * <code>bool compressed = 5;</code>
     */
    public Builder setCompressed(boolean value) {
      
      compressed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool compressed = 5;</code>
     */
    public Builder clearCompressed() {
      
      compressed_ = false;
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <code>.com.proto.GatewayStatus status = 6;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.com.proto.GatewayStatus status = 6;</code>
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.proto.GatewayStatus status = 6;</code>
     */
    public com.example.entities.GatewayStatus getStatus() {
      @SuppressWarnings("deprecation")
      com.example.entities.GatewayStatus result = com.example.entities.GatewayStatus.valueOf(status_);
      return result == null ? com.example.entities.GatewayStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.proto.GatewayStatus status = 6;</code>
     */
    public Builder setStatus(com.example.entities.GatewayStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.proto.GatewayStatus status = 6;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.proto.ServerClientMessageHeader)
  }

  // @@protoc_insertion_point(class_scope:com.proto.ServerClientMessageHeader)
  private static final com.example.entities.ServerClientMessageHeader DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.entities.ServerClientMessageHeader();
  }

  public static com.example.entities.ServerClientMessageHeader getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServerClientMessageHeader>
      PARSER = new com.google.protobuf.AbstractParser<ServerClientMessageHeader>() {
    @java.lang.Override
    public ServerClientMessageHeader parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ServerClientMessageHeader(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ServerClientMessageHeader> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServerClientMessageHeader> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.entities.ServerClientMessageHeader getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

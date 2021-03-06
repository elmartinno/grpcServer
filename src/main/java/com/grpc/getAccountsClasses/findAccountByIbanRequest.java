// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test.proto

package com.grpc.getAccountsClasses;

/**
 * Protobuf type {@code com.grpc.getAccountsClasses.findAccountByIbanRequest}
 */
public  final class findAccountByIbanRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.grpc.getAccountsClasses.findAccountByIbanRequest)
    findAccountByIbanRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use findAccountByIbanRequest.newBuilder() to construct.
  private findAccountByIbanRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private findAccountByIbanRequest() {
    s_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private findAccountByIbanRequest(
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

            s_ = s;
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
    return com.grpc.getAccountsClasses.Test.internal_static_com_grpc_getAccountsClasses_findAccountByIbanRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.getAccountsClasses.Test.internal_static_com_grpc_getAccountsClasses_findAccountByIbanRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.getAccountsClasses.findAccountByIbanRequest.class, com.grpc.getAccountsClasses.findAccountByIbanRequest.Builder.class);
  }

  public static final int S_FIELD_NUMBER = 1;
  private volatile java.lang.Object s_;
  /**
   * <code>string s = 1;</code>
   */
  public java.lang.String getS() {
    java.lang.Object ref = s_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      s_ = s;
      return s;
    }
  }
  /**
   * <code>string s = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSBytes() {
    java.lang.Object ref = s_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      s_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getSBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, s_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, s_);
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
    if (!(obj instanceof com.grpc.getAccountsClasses.findAccountByIbanRequest)) {
      return super.equals(obj);
    }
    com.grpc.getAccountsClasses.findAccountByIbanRequest other = (com.grpc.getAccountsClasses.findAccountByIbanRequest) obj;

    boolean result = true;
    result = result && getS()
        .equals(other.getS());
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
    hash = (37 * hash) + S_FIELD_NUMBER;
    hash = (53 * hash) + getS().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpc.getAccountsClasses.findAccountByIbanRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.getAccountsClasses.findAccountByIbanRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.getAccountsClasses.findAccountByIbanRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.getAccountsClasses.findAccountByIbanRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.getAccountsClasses.findAccountByIbanRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.getAccountsClasses.findAccountByIbanRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.getAccountsClasses.findAccountByIbanRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.getAccountsClasses.findAccountByIbanRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.getAccountsClasses.findAccountByIbanRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grpc.getAccountsClasses.findAccountByIbanRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.getAccountsClasses.findAccountByIbanRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.getAccountsClasses.findAccountByIbanRequest parseFrom(
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
  public static Builder newBuilder(com.grpc.getAccountsClasses.findAccountByIbanRequest prototype) {
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
   * Protobuf type {@code com.grpc.getAccountsClasses.findAccountByIbanRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.grpc.getAccountsClasses.findAccountByIbanRequest)
      com.grpc.getAccountsClasses.findAccountByIbanRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.getAccountsClasses.Test.internal_static_com_grpc_getAccountsClasses_findAccountByIbanRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.getAccountsClasses.Test.internal_static_com_grpc_getAccountsClasses_findAccountByIbanRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.getAccountsClasses.findAccountByIbanRequest.class, com.grpc.getAccountsClasses.findAccountByIbanRequest.Builder.class);
    }

    // Construct using com.grpc.getAccountsClasses.findAccountByIbanRequest.newBuilder()
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
      s_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.getAccountsClasses.Test.internal_static_com_grpc_getAccountsClasses_findAccountByIbanRequest_descriptor;
    }

    @java.lang.Override
    public com.grpc.getAccountsClasses.findAccountByIbanRequest getDefaultInstanceForType() {
      return com.grpc.getAccountsClasses.findAccountByIbanRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.grpc.getAccountsClasses.findAccountByIbanRequest build() {
      com.grpc.getAccountsClasses.findAccountByIbanRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.grpc.getAccountsClasses.findAccountByIbanRequest buildPartial() {
      com.grpc.getAccountsClasses.findAccountByIbanRequest result = new com.grpc.getAccountsClasses.findAccountByIbanRequest(this);
      result.s_ = s_;
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
      if (other instanceof com.grpc.getAccountsClasses.findAccountByIbanRequest) {
        return mergeFrom((com.grpc.getAccountsClasses.findAccountByIbanRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpc.getAccountsClasses.findAccountByIbanRequest other) {
      if (other == com.grpc.getAccountsClasses.findAccountByIbanRequest.getDefaultInstance()) return this;
      if (!other.getS().isEmpty()) {
        s_ = other.s_;
        onChanged();
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
      com.grpc.getAccountsClasses.findAccountByIbanRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.grpc.getAccountsClasses.findAccountByIbanRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object s_ = "";
    /**
     * <code>string s = 1;</code>
     */
    public java.lang.String getS() {
      java.lang.Object ref = s_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        s_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string s = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSBytes() {
      java.lang.Object ref = s_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        s_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string s = 1;</code>
     */
    public Builder setS(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      s_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string s = 1;</code>
     */
    public Builder clearS() {
      
      s_ = getDefaultInstance().getS();
      onChanged();
      return this;
    }
    /**
     * <code>string s = 1;</code>
     */
    public Builder setSBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      s_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.grpc.getAccountsClasses.findAccountByIbanRequest)
  }

  // @@protoc_insertion_point(class_scope:com.grpc.getAccountsClasses.findAccountByIbanRequest)
  private static final com.grpc.getAccountsClasses.findAccountByIbanRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.getAccountsClasses.findAccountByIbanRequest();
  }

  public static com.grpc.getAccountsClasses.findAccountByIbanRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<findAccountByIbanRequest>
      PARSER = new com.google.protobuf.AbstractParser<findAccountByIbanRequest>() {
    @java.lang.Override
    public findAccountByIbanRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new findAccountByIbanRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<findAccountByIbanRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<findAccountByIbanRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.grpc.getAccountsClasses.findAccountByIbanRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


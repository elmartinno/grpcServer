// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test.proto

package com.grpc.getAccountsClasses;

/**
 * Protobuf type {@code com.grpc.getAccountsClasses.addTurnoverRequest}
 */
public  final class addTurnoverRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.grpc.getAccountsClasses.addTurnoverRequest)
    addTurnoverRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use addTurnoverRequest.newBuilder() to construct.
  private addTurnoverRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private addTurnoverRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private addTurnoverRequest(
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
            com.grpc.getAccountsClasses.TurnoverGrpc.Builder subBuilder = null;
            if (account_ != null) {
              subBuilder = account_.toBuilder();
            }
            account_ = input.readMessage(com.grpc.getAccountsClasses.TurnoverGrpc.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(account_);
              account_ = subBuilder.buildPartial();
            }

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
    return com.grpc.getAccountsClasses.Test.internal_static_com_grpc_getAccountsClasses_addTurnoverRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.getAccountsClasses.Test.internal_static_com_grpc_getAccountsClasses_addTurnoverRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.getAccountsClasses.addTurnoverRequest.class, com.grpc.getAccountsClasses.addTurnoverRequest.Builder.class);
  }

  public static final int ACCOUNT_FIELD_NUMBER = 1;
  private com.grpc.getAccountsClasses.TurnoverGrpc account_;
  /**
   * <code>.com.grpc.getAccountsClasses.TurnoverGrpc account = 1;</code>
   */
  public boolean hasAccount() {
    return account_ != null;
  }
  /**
   * <code>.com.grpc.getAccountsClasses.TurnoverGrpc account = 1;</code>
   */
  public com.grpc.getAccountsClasses.TurnoverGrpc getAccount() {
    return account_ == null ? com.grpc.getAccountsClasses.TurnoverGrpc.getDefaultInstance() : account_;
  }
  /**
   * <code>.com.grpc.getAccountsClasses.TurnoverGrpc account = 1;</code>
   */
  public com.grpc.getAccountsClasses.TurnoverGrpcOrBuilder getAccountOrBuilder() {
    return getAccount();
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
    if (account_ != null) {
      output.writeMessage(1, getAccount());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (account_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAccount());
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
    if (!(obj instanceof com.grpc.getAccountsClasses.addTurnoverRequest)) {
      return super.equals(obj);
    }
    com.grpc.getAccountsClasses.addTurnoverRequest other = (com.grpc.getAccountsClasses.addTurnoverRequest) obj;

    boolean result = true;
    result = result && (hasAccount() == other.hasAccount());
    if (hasAccount()) {
      result = result && getAccount()
          .equals(other.getAccount());
    }
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
    if (hasAccount()) {
      hash = (37 * hash) + ACCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getAccount().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpc.getAccountsClasses.addTurnoverRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.getAccountsClasses.addTurnoverRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.getAccountsClasses.addTurnoverRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.getAccountsClasses.addTurnoverRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.getAccountsClasses.addTurnoverRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.getAccountsClasses.addTurnoverRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.getAccountsClasses.addTurnoverRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.getAccountsClasses.addTurnoverRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.getAccountsClasses.addTurnoverRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grpc.getAccountsClasses.addTurnoverRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.getAccountsClasses.addTurnoverRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.getAccountsClasses.addTurnoverRequest parseFrom(
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
  public static Builder newBuilder(com.grpc.getAccountsClasses.addTurnoverRequest prototype) {
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
   * Protobuf type {@code com.grpc.getAccountsClasses.addTurnoverRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.grpc.getAccountsClasses.addTurnoverRequest)
      com.grpc.getAccountsClasses.addTurnoverRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.getAccountsClasses.Test.internal_static_com_grpc_getAccountsClasses_addTurnoverRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.getAccountsClasses.Test.internal_static_com_grpc_getAccountsClasses_addTurnoverRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.getAccountsClasses.addTurnoverRequest.class, com.grpc.getAccountsClasses.addTurnoverRequest.Builder.class);
    }

    // Construct using com.grpc.getAccountsClasses.addTurnoverRequest.newBuilder()
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
      if (accountBuilder_ == null) {
        account_ = null;
      } else {
        account_ = null;
        accountBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.getAccountsClasses.Test.internal_static_com_grpc_getAccountsClasses_addTurnoverRequest_descriptor;
    }

    @java.lang.Override
    public com.grpc.getAccountsClasses.addTurnoverRequest getDefaultInstanceForType() {
      return com.grpc.getAccountsClasses.addTurnoverRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.grpc.getAccountsClasses.addTurnoverRequest build() {
      com.grpc.getAccountsClasses.addTurnoverRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.grpc.getAccountsClasses.addTurnoverRequest buildPartial() {
      com.grpc.getAccountsClasses.addTurnoverRequest result = new com.grpc.getAccountsClasses.addTurnoverRequest(this);
      if (accountBuilder_ == null) {
        result.account_ = account_;
      } else {
        result.account_ = accountBuilder_.build();
      }
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
      if (other instanceof com.grpc.getAccountsClasses.addTurnoverRequest) {
        return mergeFrom((com.grpc.getAccountsClasses.addTurnoverRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpc.getAccountsClasses.addTurnoverRequest other) {
      if (other == com.grpc.getAccountsClasses.addTurnoverRequest.getDefaultInstance()) return this;
      if (other.hasAccount()) {
        mergeAccount(other.getAccount());
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
      com.grpc.getAccountsClasses.addTurnoverRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.grpc.getAccountsClasses.addTurnoverRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.grpc.getAccountsClasses.TurnoverGrpc account_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.grpc.getAccountsClasses.TurnoverGrpc, com.grpc.getAccountsClasses.TurnoverGrpc.Builder, com.grpc.getAccountsClasses.TurnoverGrpcOrBuilder> accountBuilder_;
    /**
     * <code>.com.grpc.getAccountsClasses.TurnoverGrpc account = 1;</code>
     */
    public boolean hasAccount() {
      return accountBuilder_ != null || account_ != null;
    }
    /**
     * <code>.com.grpc.getAccountsClasses.TurnoverGrpc account = 1;</code>
     */
    public com.grpc.getAccountsClasses.TurnoverGrpc getAccount() {
      if (accountBuilder_ == null) {
        return account_ == null ? com.grpc.getAccountsClasses.TurnoverGrpc.getDefaultInstance() : account_;
      } else {
        return accountBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.grpc.getAccountsClasses.TurnoverGrpc account = 1;</code>
     */
    public Builder setAccount(com.grpc.getAccountsClasses.TurnoverGrpc value) {
      if (accountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        account_ = value;
        onChanged();
      } else {
        accountBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.grpc.getAccountsClasses.TurnoverGrpc account = 1;</code>
     */
    public Builder setAccount(
        com.grpc.getAccountsClasses.TurnoverGrpc.Builder builderForValue) {
      if (accountBuilder_ == null) {
        account_ = builderForValue.build();
        onChanged();
      } else {
        accountBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.grpc.getAccountsClasses.TurnoverGrpc account = 1;</code>
     */
    public Builder mergeAccount(com.grpc.getAccountsClasses.TurnoverGrpc value) {
      if (accountBuilder_ == null) {
        if (account_ != null) {
          account_ =
            com.grpc.getAccountsClasses.TurnoverGrpc.newBuilder(account_).mergeFrom(value).buildPartial();
        } else {
          account_ = value;
        }
        onChanged();
      } else {
        accountBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.grpc.getAccountsClasses.TurnoverGrpc account = 1;</code>
     */
    public Builder clearAccount() {
      if (accountBuilder_ == null) {
        account_ = null;
        onChanged();
      } else {
        account_ = null;
        accountBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.grpc.getAccountsClasses.TurnoverGrpc account = 1;</code>
     */
    public com.grpc.getAccountsClasses.TurnoverGrpc.Builder getAccountBuilder() {
      
      onChanged();
      return getAccountFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.grpc.getAccountsClasses.TurnoverGrpc account = 1;</code>
     */
    public com.grpc.getAccountsClasses.TurnoverGrpcOrBuilder getAccountOrBuilder() {
      if (accountBuilder_ != null) {
        return accountBuilder_.getMessageOrBuilder();
      } else {
        return account_ == null ?
            com.grpc.getAccountsClasses.TurnoverGrpc.getDefaultInstance() : account_;
      }
    }
    /**
     * <code>.com.grpc.getAccountsClasses.TurnoverGrpc account = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.grpc.getAccountsClasses.TurnoverGrpc, com.grpc.getAccountsClasses.TurnoverGrpc.Builder, com.grpc.getAccountsClasses.TurnoverGrpcOrBuilder> 
        getAccountFieldBuilder() {
      if (accountBuilder_ == null) {
        accountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.grpc.getAccountsClasses.TurnoverGrpc, com.grpc.getAccountsClasses.TurnoverGrpc.Builder, com.grpc.getAccountsClasses.TurnoverGrpcOrBuilder>(
                getAccount(),
                getParentForChildren(),
                isClean());
        account_ = null;
      }
      return accountBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.grpc.getAccountsClasses.addTurnoverRequest)
  }

  // @@protoc_insertion_point(class_scope:com.grpc.getAccountsClasses.addTurnoverRequest)
  private static final com.grpc.getAccountsClasses.addTurnoverRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.getAccountsClasses.addTurnoverRequest();
  }

  public static com.grpc.getAccountsClasses.addTurnoverRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<addTurnoverRequest>
      PARSER = new com.google.protobuf.AbstractParser<addTurnoverRequest>() {
    @java.lang.Override
    public addTurnoverRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new addTurnoverRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<addTurnoverRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<addTurnoverRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.grpc.getAccountsClasses.addTurnoverRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_upload.proto

package com.bytedanceapi.model.vod.business;

public interface URLSetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Vcloud.Models.Vod.URLSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string RequestId = 1;</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <code>string RequestId = 1;</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();

  /**
   * <code>string JobId = 2;</code>
   * @return The jobId.
   */
  java.lang.String getJobId();
  /**
   * <code>string JobId = 2;</code>
   * @return The bytes for jobId.
   */
  com.google.protobuf.ByteString
      getJobIdBytes();

  /**
   * <code>string SourceUrl = 3;</code>
   * @return The sourceUrl.
   */
  java.lang.String getSourceUrl();
  /**
   * <code>string SourceUrl = 3;</code>
   * @return The bytes for sourceUrl.
   */
  com.google.protobuf.ByteString
      getSourceUrlBytes();

  /**
   * <code>string State = 4;</code>
   * @return The state.
   */
  java.lang.String getState();
  /**
   * <code>string State = 4;</code>
   * @return The bytes for state.
   */
  com.google.protobuf.ByteString
      getStateBytes();

  /**
   * <code>string Vid = 5;</code>
   * @return The vid.
   */
  java.lang.String getVid();
  /**
   * <code>string Vid = 5;</code>
   * @return The bytes for vid.
   */
  com.google.protobuf.ByteString
      getVidBytes();

  /**
   * <code>string SpaceName = 6;</code>
   * @return The spaceName.
   */
  java.lang.String getSpaceName();
  /**
   * <code>string SpaceName = 6;</code>
   * @return The bytes for spaceName.
   */
  com.google.protobuf.ByteString
      getSpaceNameBytes();

  /**
   * <code>string AccountId = 7;</code>
   * @return The accountId.
   */
  java.lang.String getAccountId();
  /**
   * <code>string AccountId = 7;</code>
   * @return The bytes for accountId.
   */
  com.google.protobuf.ByteString
      getAccountIdBytes();

  /**
   * <code>.Vcloud.Models.Vod.VodSourceInfo SourceInfo = 8;</code>
   * @return Whether the sourceInfo field is set.
   */
  boolean hasSourceInfo();
  /**
   * <code>.Vcloud.Models.Vod.VodSourceInfo SourceInfo = 8;</code>
   * @return The sourceInfo.
   */
  com.bytedanceapi.model.vod.business.VodSourceInfo getSourceInfo();
  /**
   * <code>.Vcloud.Models.Vod.VodSourceInfo SourceInfo = 8;</code>
   */
  com.bytedanceapi.model.vod.business.VodSourceInfoOrBuilder getSourceInfoOrBuilder();
}

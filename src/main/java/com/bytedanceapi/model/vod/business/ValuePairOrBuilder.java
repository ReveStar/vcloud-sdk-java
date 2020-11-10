// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_upload.proto

package com.bytedanceapi.model.vod.business;

public interface ValuePairOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Vcloud.Models.Vod.ValuePair)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Url对应的JobId
   * </pre>
   *
   * <code>string JobId = 1;</code>
   * @return The jobId.
   */
  java.lang.String getJobId();
  /**
   * <pre>
   * Url对应的JobId
   * </pre>
   *
   * <code>string JobId = 1;</code>
   * @return The bytes for jobId.
   */
  com.google.protobuf.ByteString
      getJobIdBytes();

  /**
   * <pre>
   * 上传的Url
   * </pre>
   *
   * <code>string SourceUrl = 2;</code>
   * @return The sourceUrl.
   */
  java.lang.String getSourceUrl();
  /**
   * <pre>
   * 上传的Url
   * </pre>
   *
   * <code>string SourceUrl = 2;</code>
   * @return The bytes for sourceUrl.
   */
  com.google.protobuf.ByteString
      getSourceUrlBytes();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod_play.proto

package com.bytedanceapi.model.common;

public interface VodGetPlayInfoResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Vcloud.Models.Vod.VodGetPlayInfoResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Vcloud.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return Whether the responseMetadata field is set.
   */
  boolean hasResponseMetadata();
  /**
   * <code>.Vcloud.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return The responseMetadata.
   */
  com.bytedanceapi.model.common.ResponseMetadata getResponseMetadata();
  /**
   * <code>.Vcloud.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   */
  com.bytedanceapi.model.common.ResponseMetadataOrBuilder getResponseMetadataOrBuilder();

  /**
   * <code>.Vcloud.Models.Vod.VodGetPlayInfoResult Result = 2;</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <code>.Vcloud.Models.Vod.VodGetPlayInfoResult Result = 2;</code>
   * @return The result.
   */
  com.bytedanceapi.model.common.VodGetPlayInfoResult getResult();
  /**
   * <code>.Vcloud.Models.Vod.VodGetPlayInfoResult Result = 2;</code>
   */
  com.bytedanceapi.model.common.VodGetPlayInfoResultOrBuilder getResultOrBuilder();
}
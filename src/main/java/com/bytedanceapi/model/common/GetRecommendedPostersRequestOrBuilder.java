// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod_media.proto

package com.bytedanceapi.model.common;

public interface GetRecommendedPostersRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Vcloud.Models.Vod.GetRecommendedPostersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *视频ID列表
   * </pre>
   *
   * <code>repeated string Vids = 1;</code>
   * @return A list containing the vids.
   */
  java.util.List<java.lang.String>
      getVidsList();
  /**
   * <pre>
   *视频ID列表
   * </pre>
   *
   * <code>repeated string Vids = 1;</code>
   * @return The count of vids.
   */
  int getVidsCount();
  /**
   * <pre>
   *视频ID列表
   * </pre>
   *
   * <code>repeated string Vids = 1;</code>
   * @param index The index of the element to return.
   * @return The vids at the given index.
   */
  java.lang.String getVids(int index);
  /**
   * <pre>
   *视频ID列表
   * </pre>
   *
   * <code>repeated string Vids = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the vids at the given index.
   */
  com.google.protobuf.ByteString
      getVidsBytes(int index);
}
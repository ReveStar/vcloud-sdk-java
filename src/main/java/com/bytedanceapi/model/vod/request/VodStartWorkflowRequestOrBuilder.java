// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.bytedanceapi.model.vod.request;

public interface VodStartWorkflowRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Vcloud.Models.Vod.VodStartWorkflowRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 视频Id
   * </pre>
   *
   * <code>string Vid = 1;</code>
   * @return The vid.
   */
  java.lang.String getVid();
  /**
   * <pre>
   * 视频Id
   * </pre>
   *
   * <code>string Vid = 1;</code>
   * @return The bytes for vid.
   */
  com.google.protobuf.ByteString
      getVidBytes();

  /**
   * <pre>
   * 动态参数
   * </pre>
   *
   * <code>.Vcloud.Models.Vod.WorkflowParams Input = 2;</code>
   * @return Whether the input field is set.
   */
  boolean hasInput();
  /**
   * <pre>
   * 动态参数
   * </pre>
   *
   * <code>.Vcloud.Models.Vod.WorkflowParams Input = 2;</code>
   * @return The input.
   */
  com.bytedanceapi.model.vod.business.WorkflowParams getInput();
  /**
   * <pre>
   * 动态参数
   * </pre>
   *
   * <code>.Vcloud.Models.Vod.WorkflowParams Input = 2;</code>
   */
  com.bytedanceapi.model.vod.business.WorkflowParamsOrBuilder getInputOrBuilder();

  /**
   * <pre>
   * 任务优先级
   * </pre>
   *
   * <code>int32 Priority = 3;</code>
   * @return The priority.
   */
  int getPriority();

  /**
   * <pre>
   * 回调参数
   * </pre>
   *
   * <code>string CallbackArgs = 4;</code>
   * @return The callbackArgs.
   */
  java.lang.String getCallbackArgs();
  /**
   * <pre>
   * 回调参数
   * </pre>
   *
   * <code>string CallbackArgs = 4;</code>
   * @return The bytes for callbackArgs.
   */
  com.google.protobuf.ByteString
      getCallbackArgsBytes();
}

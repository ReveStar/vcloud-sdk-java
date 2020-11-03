// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_workflow.proto

package com.bytedanceapi.model.vod.business;

public interface TranscodeAudioOverrideOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Vcloud.Models.Vod.TranscodeAudioOverride)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 被覆盖的音频模板Id, 支持ALL
   * </pre>
   *
   * <code>repeated string TemplateId = 1;</code>
   * @return A list containing the templateId.
   */
  java.util.List<java.lang.String>
      getTemplateIdList();
  /**
   * <pre>
   * 被覆盖的音频模板Id, 支持ALL
   * </pre>
   *
   * <code>repeated string TemplateId = 1;</code>
   * @return The count of templateId.
   */
  int getTemplateIdCount();
  /**
   * <pre>
   * 被覆盖的音频模板Id, 支持ALL
   * </pre>
   *
   * <code>repeated string TemplateId = 1;</code>
   * @param index The index of the element to return.
   * @return The templateId at the given index.
   */
  java.lang.String getTemplateId(int index);
  /**
   * <pre>
   * 被覆盖的音频模板Id, 支持ALL
   * </pre>
   *
   * <code>repeated string TemplateId = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the templateId at the given index.
   */
  com.google.protobuf.ByteString
      getTemplateIdBytes(int index);

  /**
   * <code>.Vcloud.Models.Vod.Clip Clip = 2;</code>
   * @return Whether the clip field is set.
   */
  boolean hasClip();
  /**
   * <code>.Vcloud.Models.Vod.Clip Clip = 2;</code>
   * @return The clip.
   */
  com.bytedanceapi.model.vod.business.Clip getClip();
  /**
   * <code>.Vcloud.Models.Vod.Clip Clip = 2;</code>
   */
  com.bytedanceapi.model.vod.business.ClipOrBuilder getClipOrBuilder();
}
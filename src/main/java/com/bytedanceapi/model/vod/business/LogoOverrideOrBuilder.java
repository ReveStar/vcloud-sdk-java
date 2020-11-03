// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_workflow.proto

package com.bytedanceapi.model.vod.business;

public interface LogoOverrideOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Vcloud.Models.Vod.LogoOverride)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 被覆盖的水印模板Id, 支持ALL
   * </pre>
   *
   * <code>repeated string TemplateId = 1;</code>
   * @return A list containing the templateId.
   */
  java.util.List<java.lang.String>
      getTemplateIdList();
  /**
   * <pre>
   * 被覆盖的水印模板Id, 支持ALL
   * </pre>
   *
   * <code>repeated string TemplateId = 1;</code>
   * @return The count of templateId.
   */
  int getTemplateIdCount();
  /**
   * <pre>
   * 被覆盖的水印模板Id, 支持ALL
   * </pre>
   *
   * <code>repeated string TemplateId = 1;</code>
   * @param index The index of the element to return.
   * @return The templateId at the given index.
   */
  java.lang.String getTemplateId(int index);
  /**
   * <pre>
   * 被覆盖的水印模板Id, 支持ALL
   * </pre>
   *
   * <code>repeated string TemplateId = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the templateId at the given index.
   */
  com.google.protobuf.ByteString
      getTemplateIdBytes(int index);

  /**
   * <pre>
   * 自定义水印变量
   * </pre>
   *
   * <code>map&lt;string, string&gt; Vars = 2;</code>
   */
  int getVarsCount();
  /**
   * <pre>
   * 自定义水印变量
   * </pre>
   *
   * <code>map&lt;string, string&gt; Vars = 2;</code>
   */
  boolean containsVars(
      java.lang.String key);
  /**
   * Use {@link #getVarsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getVars();
  /**
   * <pre>
   * 自定义水印变量
   * </pre>
   *
   * <code>map&lt;string, string&gt; Vars = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getVarsMap();
  /**
   * <pre>
   * 自定义水印变量
   * </pre>
   *
   * <code>map&lt;string, string&gt; Vars = 2;</code>
   */

  java.lang.String getVarsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * 自定义水印变量
   * </pre>
   *
   * <code>map&lt;string, string&gt; Vars = 2;</code>
   */

  java.lang.String getVarsOrThrow(
      java.lang.String key);
}
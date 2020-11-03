// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_common.proto

package com.bytedanceapi.model.vod.business;

public final class VodCommon {
  private VodCommon() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Vcloud_Models_Vod_VodSourceInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Vcloud_Models_Vod_VodSourceInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Vcloud_Models_Vod_VodAdaptiveInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Vcloud_Models_Vod_VodAdaptiveInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Vcloud_Models_Vod_VodPlayInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Vcloud_Models_Vod_VodPlayInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035vod/business/vod_common.proto\022\021Vcloud." +
      "Models.Vod\"\364\001\n\rVodSourceInfo\022\016\n\006FileId\030\001" +
      " \001(\t\022\013\n\003Md5\030\002 \001(\t\022\020\n\010FileType\030\003 \001(\t\022\r\n\005C" +
      "odec\030\004 \001(\t\022\016\n\006Height\030\005 \001(\003\022\r\n\005Width\030\006 \001(" +
      "\003\022\016\n\006Format\030\007 \001(\t\022\020\n\010Duration\030\010 \001(\002\022\014\n\004S" +
      "ize\030\t \001(\003\022\020\n\010StoreUri\030\n \001(\t\022\022\n\nDefinitio" +
      "n\030\013 \001(\t\022\017\n\007Bitrate\030\014 \001(\003\022\013\n\003Fps\030\r \001(\002\022\022\n" +
      "\nCreateTime\030\016 \001(\t\"S\n\017VodAdaptiveInfo\022\023\n\013" +
      "MainPlayUrl\030\001 \001(\t\022\025\n\rBackupPlayUrl\030\002 \001(\t" +
      "\022\024\n\014AdaptiveType\030\003 \001(\t\"\320\003\n\013VodPlayInfo\022\016" +
      "\n\006FileId\030\001 \001(\t\022\013\n\003Md5\030\002 \001(\t\022\020\n\010FileType\030" +
      "\003 \001(\t\022\016\n\006Format\030\004 \001(\t\022\r\n\005Codec\030\005 \001(\t\022\022\n\n" +
      "Definition\030\006 \001(\t\022\023\n\013MainPlayUrl\030\007 \001(\t\022\025\n" +
      "\rBackupPlayUrl\030\010 \001(\t\022\017\n\007Bitrate\030\t \001(\002\022\r\n" +
      "\005Width\030\n \001(\003\022\016\n\006Height\030\013 \001(\003\022\014\n\004Size\030\014 \001" +
      "(\003\022\021\n\tCheckInfo\030\r \001(\t\022\022\n\nIndexRange\030\016 \001(" +
      "\t\022\021\n\tInitRange\030\017 \001(\t\022\023\n\013PreloadSize\030\020 \001(" +
      "\003\022\026\n\016PreloadMinStep\030\021 \001(\003\022\026\n\016PreloadMaxS" +
      "tep\030\022 \001(\003\022\027\n\017PreloadInterval\030\023 \001(\003\022\024\n\014P2" +
      "pVerifyUrl\030\024 \001(\t\022\020\n\010PlayAuth\030\025 \001(\t\022\022\n\nPl" +
      "ayAuthId\030\026 \001(\t\022\020\n\010LogoType\030\027 \001(\t\022\017\n\007Qual" +
      "ity\030\030 \001(\tB\246\001\n#com.bytedanceapi.model.vod" +
      ".businessB\tVodCommonP\001Z9github.com/TTvcl" +
      "oud/vcloud-sdk-golang/models/vod/busines" +
      "s\240\001\001\330\001\001\302\002\000\312\002\021Vcloud\\Models\\Vod\342\002\031Vcloud\\" +
      "Models\\GPBMetadatab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Vcloud_Models_Vod_VodSourceInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Vcloud_Models_Vod_VodSourceInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Vcloud_Models_Vod_VodSourceInfo_descriptor,
        new java.lang.String[] { "FileId", "Md5", "FileType", "Codec", "Height", "Width", "Format", "Duration", "Size", "StoreUri", "Definition", "Bitrate", "Fps", "CreateTime", });
    internal_static_Vcloud_Models_Vod_VodAdaptiveInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Vcloud_Models_Vod_VodAdaptiveInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Vcloud_Models_Vod_VodAdaptiveInfo_descriptor,
        new java.lang.String[] { "MainPlayUrl", "BackupPlayUrl", "AdaptiveType", });
    internal_static_Vcloud_Models_Vod_VodPlayInfo_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Vcloud_Models_Vod_VodPlayInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Vcloud_Models_Vod_VodPlayInfo_descriptor,
        new java.lang.String[] { "FileId", "Md5", "FileType", "Format", "Codec", "Definition", "MainPlayUrl", "BackupPlayUrl", "Bitrate", "Width", "Height", "Size", "CheckInfo", "IndexRange", "InitRange", "PreloadSize", "PreloadMinStep", "PreloadMaxStep", "PreloadInterval", "P2PVerifyUrl", "PlayAuth", "PlayAuthId", "LogoType", "Quality", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

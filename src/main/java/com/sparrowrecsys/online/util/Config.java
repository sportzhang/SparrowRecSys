package com.sparrowrecsys.online.util;

public class Config {
    public static final String DATA_SOURCE_REDIS = "redis";
    public static final String DATA_SOURCE_FILE = "file";

//    定义是从哪里获取embedding数据
    public static String EMB_DATA_SOURCE = Config.DATA_SOURCE_REDIS;
    public static boolean IS_LOAD_USER_FEATURE_FROM_REDIS = false;
    public static boolean IS_LOAD_ITEM_FEATURE_FROM_REDIS = false;

    public static boolean IS_ENABLE_AB_TEST = false;

}

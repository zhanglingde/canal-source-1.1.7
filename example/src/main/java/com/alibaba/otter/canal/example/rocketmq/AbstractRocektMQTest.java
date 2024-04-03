package com.alibaba.otter.canal.example.rocketmq;

import com.alibaba.otter.canal.example.BaseCanalClientTest;

public abstract class AbstractRocektMQTest extends BaseCanalClientTest {

    public static String  topic              = "test_user";
    public static String  groupId            = "group";
    public static String  nameServers        = "192.168.65.130:9876";
    public static String  accessKey          = "";
    public static String  secretKey          = "";
    public static boolean enableMessageTrace = false;
    public static String  accessChannel      = "local";
    public static String  namespace          = "";
}

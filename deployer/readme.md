

# 源码启动

1. 注释 pom 中相应连接器的 jar-with-dependencies（tcp 模式不用注释）
2. 启动类：CanalLauncher


CanalServer 监听到 binlog 日志后，通过 CanalRocketMQProducer#sendMessage 发送 mq 消息
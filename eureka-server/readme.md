# spring cloud 服务端注册中心

## 说明
 eureka注册中心.通过注册中间进行监控客户端数量与在线状态,便于管理与客户端升级

## 集群
 1. 通过互相注册eureka达到高可用的部署
 2. 模拟集群创建peer.yml
 3. 启动不同的peer.yml文件可以模拟启动多个注册中心,可以在 [localhost:8761](http://127.0.0.1:8761/) 查看DS Replicas下注册的服务器.

## 感谢: 
[走进Spring Cloud之二 eureka注册中心（Greenwich版本）](https://blog.csdn.net/weixin_43430036/article/details/83865348)


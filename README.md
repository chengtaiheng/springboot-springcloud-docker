这是一个docker和springcloud分布式项目结合的项目，
将本项目copy到linux虚拟机，
有以下几点要注意
1.需要修改run-container.sh中的 -v 映射的路径，此处映射的是log的地址，
2.docker 容器运行的是docker情景模式（即application—docker.yml），docker 情景模式中
defaultZone: "http://eurake:1668/eureka/"
eurake 是 run-container.sh中--link 参数的冒号后面的别名。
3，需要创建一个专用的网络，否则服务可以在注册中心可以注册上，但是会报错，
run-container脚本中已为大家创建好。

运行项目流程如下
1.运行refactor.sh脚本，自动打包，构建镜像。
2.运行run-container.sh脚本,构建容器。
3 访问虚拟机ip：1669/test路径，
4 会得到
<Map>
<message>雄鹰雄鹰，我已收到</message>
</Map>

结果

新增 通过docker部署elk（elasticsearch，logstash，kibana）
镜像构建脚本还是用refactor.sh
在项目根目录下输入docker-compose up
流程如下
1.运行refactor.sh脚本，自动打包，构建镜像。
2.在项目根目录下运行docker-compose up命令，构建项目镜像以及logstash镜像
3.下面请访问https://www.jianshu.com/p/817b5b50ec9a，查看详情。


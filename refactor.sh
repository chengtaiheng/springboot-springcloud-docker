#!/usr/bin/env bash

#删除为none的对象
docker images | grep '<none>' | awk -F ' ' '{print$3}' | xargs docker rmi 2>/dev/null 1>&2 

#删除原有镜像
docker rmi chth/springboot-sprinbcloud-docker-eurake:1.0.0 2>/dev/null 1>&2
docker rmi chth/springboot-springcloud-docker-front:1.0.0  2>/dev/null 1>&2
docker rmi chth/springboot-springcloud-docker-service:1.0.0 2>/dev/null 1>&2

#用pom文件打包项目，构建docker镜像
mvn -f ./springboot-springcloud-docker-eurake/pom.xml clean package docker:build
mvn -f ./springboot-springcloud-docker-front/pom.xml clean package docker:build
mvn -f ./springboot-springcloud-docker-service/pom.xml clean package docker:build


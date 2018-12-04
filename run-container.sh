#!/usr/bin/env bash

#创建专属网络
docker network create tiger 1>/dev/null 2>&1


#停止原来的容器
docker stop front  1>/dev/null 2>&1
docker stop eurake  1>/dev/null 2>&1
docker stop service  1>/dev/null 2>&1

#删除容器
docker rm front  1>/dev/null 2>&1
docker rm eurake  1>/dev/null 2>&1
docker rm service  1>/dev/null 2>&1


docker run \
	-d \
	-p 1668:1668 \
	--network=tiger \
	--name eurake \
	-v /docker_project/logs:/chth \
	chth/springboot-springcloud-docker-eurake:1.0.0

docker run \
	-d \
	-p 1667:1667 \
	--network=tiger \
	--link=eurake:eurake \
	--name service \
	-v /docker_project/logs:/chth \
	chth/springboot-springcloud-docker-service:1.0.0


docker run \
	-it \
	-p 1669:1669 \
	--name front \
	-v /docker_project/logs:/chth \
	--network=tiger \
	--link=eurake:eurake \
	chth/springboot-springcloud-docker-front:1.0.0


package springboot.springcloud.docker.service.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: 程泰恒
 * @date: 2018/11/14 11:22
 */

@EnableEurekaClient
@SpringBootApplication
public class SpringBootCloudDockerServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootCloudDockerServiceApplication.class, args);
    }
}

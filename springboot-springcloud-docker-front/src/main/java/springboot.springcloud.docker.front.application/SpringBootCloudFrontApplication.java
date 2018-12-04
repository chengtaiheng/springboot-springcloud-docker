package springboot.springcloud.docker.front.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: 程泰恒
 * @date: 2018/11/14 10:02
 */

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class SpringBootCloudFrontApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCloudFrontApplication.class,args);
    }
}

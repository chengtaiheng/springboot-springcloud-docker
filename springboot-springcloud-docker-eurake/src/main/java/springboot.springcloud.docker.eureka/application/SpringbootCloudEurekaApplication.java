package springboot.springcloud.docker.eureka.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: 程泰恒
 * @date: 2018/11/14 10:47
 */

@EnableEurekaServer
@SpringBootApplication
public class SpringbootCloudEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootCloudEurekaApplication.class, args);
    }
}

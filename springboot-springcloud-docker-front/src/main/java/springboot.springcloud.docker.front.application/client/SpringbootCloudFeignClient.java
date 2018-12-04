package springboot.springcloud.docker.front.application.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * @author: 程泰恒
 * @date: 2018/11/14 10:25
 */
@FeignClient(
        name = "springboot-springcloud-docker-service",
        path = "/service"
)
public interface SpringbootCloudFeignClient {

    @GetMapping("/test")
    public Map<String, Object> testService();

}

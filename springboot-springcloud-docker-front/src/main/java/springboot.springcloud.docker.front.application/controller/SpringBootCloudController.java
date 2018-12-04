package springboot.springcloud.docker.front.application.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.springcloud.docker.front.application.client.SpringbootCloudFeignClient;
import sun.util.calendar.LocalGregorianCalendar;

import javax.validation.constraints.Size;
import java.util.Map;

/**
 * @author: 程泰恒
 * @date: 2018/11/14 10:30
 */
@Slf4j
@RestController
public class SpringBootCloudController {

    @Autowired
    private SpringbootCloudFeignClient springbootCloudFeignClient;

    @GetMapping("/test")
    public Map<String,Object> responseTest(){
        log.debug("进入测试通道");
        return  springbootCloudFeignClient.testService();
    }

}

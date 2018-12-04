package springboot.springcloud.docker.service.application.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: 程泰恒
 * @date: 2018/11/14 11:28
 */

@Slf4j
@RequestMapping("/service")
@RestController
public class ServiceController {

    @GetMapping("/test")
    public Map<String, Object> testService() {
        log.debug("进入服务层");
        Map<String, Object> response = new HashMap<String, Object>();
        response.put("message", "雄鹰雄鹰，我已收到");
        return response;
    }

}

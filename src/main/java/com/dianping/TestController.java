package com.dianping;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * TODO: 类描述
 * xiaodong.chen@meituan.com
 * 2017/7/15
 */
@Controller
@Slf4j
public class TestController {
    @ResponseBody
    @RequestMapping("/test.html")
    @HystrixCommand(groupKey = "groupTest", commandKey = "commandTest", fallbackMethod = "back",
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000"),
                    @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
                    @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "25")
            })
    public String test(int s)
    {
        log.info("test.html start,s:{}", s);
        try
        {
            Thread.sleep(s * 1000);
        } catch (Exception e)
        {
            log.error("test.html error.", e);
        }
        return "OK";
    }

    public String back(int s) {
        return "back";
    }
}

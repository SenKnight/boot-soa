package cn.com.agree.soa.controller.test;

import cn.com.agree.soa.service.test.ITestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Descriptions...
 *
 * @author Johnson
 * @date 2019/11/28.
 */
@Slf4j
@RestController
public class TestController {
    @Autowired
    private ITestService iTestService;
    
    @RequestMapping("/hello")
    public Object helloWorld(){
        return "赞同科技服务治理平台4.0版（基于Springboot）";
    }
    
    @RequestMapping("/users")
    public Object listUser(){
        return iTestService.listUser();
    }
}

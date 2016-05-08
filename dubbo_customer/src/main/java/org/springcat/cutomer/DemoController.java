package org.springcat.cutomer;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springcat.api.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by springcat on 16/5/6.
 */
@RestController
@RequestMapping(value = "/")
public class DemoController {

    @Reference
    private DemoService demoService;

    @RequestMapping(value = "hello")
    public String hello(){
        return demoService.sayHello("111");
    }

    @RequestMapping(value = "users")
    public List users(){
        return demoService.getUsers();
    }

}

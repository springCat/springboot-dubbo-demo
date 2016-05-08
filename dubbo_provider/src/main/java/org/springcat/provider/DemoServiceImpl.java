package org.springcat.provider;

import com.alibaba.dubbo.config.annotation.Service;
import org.springcat.api.DemoService;
import org.springcat.api.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by springcat on 16/5/6.
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String s) {
        return "hello " + s;
    }

    @Override
    public List getUsers() {
        List<User> userList = new ArrayList<User>();

        User u1 = new User();
        u1.setAge(11);
        u1.setName("11");
        u1.setSex("男");


        User u2 = new User();
        u2.setAge(22);
        u2.setName("22");
        u2.setSex("女");

        userList.add(u1);
        userList.add(u2);

       return userList;
    }
}

package com.nettytest.controller;

import com.nettytest.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MybatisController {
    //    @Autowired
//    private UserMapper userMapper;
//    @RequestMapping("/query")
//    @ResponseBody
//    public List<User> queryUserList(){
//        List<User> users=userMapper.queryUserList();
//        return users;
//    }
    @RequestMapping("/list")
    @ResponseBody
    public List<User> funTest() {
        User user1 = new User(1, "xiao ming", "123abc");
        User user2 = new User(2, "xiao huang", "abc000");
        ArrayList<User> arrayList = new ArrayList<>();
        arrayList.add(user1);
        arrayList.add(user2);
        return arrayList;

    }
}

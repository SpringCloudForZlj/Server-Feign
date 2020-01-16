package com.xd.feign.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xd.common.domain.Api;
import com.xd.feign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 张立军 on 2020/1/15.
 * Project Name : SpringCloud
 * Package Name : com.xd.feign.controller
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    //test
    @RequestMapping(value = "index")
    public String index(){
        return "/User/index";
    }

    @ResponseBody
    @RequestMapping(value = "GetUserById")
    public Api GetUserById(){
        String useid = "1";
        Api api = userService.GetUserById(useid);
        Object object = api.getData();
        JSONObject jsonObject = (JSONObject) JSON.toJSON(object);
        api.setData(jsonObject.getString("username"));
        return api;
    }
}

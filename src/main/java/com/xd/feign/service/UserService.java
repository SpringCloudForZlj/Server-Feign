package com.xd.feign.service;

import com.xd.common.domain.Api;
import com.xd.feign.hystrix.UserHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 张立军 on 2020/1/15.
 * Project Name : SpringCloud
 * Package Name : com.xd.feign.service
 */
@FeignClient(value = "Master-Admin",fallback = UserHystrix.class)
public interface UserService {
    @RequestMapping(value = "GetUserById",method = RequestMethod.GET)
    //参数里面应该加上@RequestParam这一参数。目的是为了能让它与controller中的参数保持一致
    public Api GetUserById(@RequestParam(value = "userid") String userid);
}

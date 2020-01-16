package com.xd.feign.hystrix;

import com.xd.common.domain.Api;
import com.xd.feign.service.UserService;
import org.springframework.stereotype.Component;

/**
 * Created by 张立军 on 2020/1/15.
 * Project Name : SpringCloud
 * Package Name : com.xd.feign.hystrix
 */
@Component
public class UserHystrix implements UserService {
    @Override
    public Api GetUserById(String userid) {
        return null;
    }
}

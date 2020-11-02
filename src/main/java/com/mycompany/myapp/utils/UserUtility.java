package com.mycompany.myapp.utils;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

//既可以是static的utility class,不用做bean - 缺点 ： 生命周期不由spring管理
//也可以声明成普通class，作为bean - 缺点，需要依赖注入到每一个使用者中


public class UserUtility {

    public String getUserName() {
        String userName;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            userName = ((UserDetails)principal).getUsername();
        } else{
            userName = principal.toString();
        }
        return userName;
    }
}

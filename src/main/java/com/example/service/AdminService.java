package com.example.service;

import com.example.pojo.Admin;

public interface AdminService {
    //完成登录判断
    Admin login(String name, String pwd);
 
}

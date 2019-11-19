package com.study_spring.factory;

import com.study_spring.service.AccountServiceImp1;

/**
 * 这是一个没有默认构造函数的工厂，用于测试spring获取bean的第二种方式
 * 假如第三方jar包是这么写的，也无法修改，才会用这种方式。
 * 思路就是：获取产生这个对象的工厂类对象，再调用工厂类的产生这个对象的方法
 */
public class InstanceFactory
{
    public AccountServiceImp1 getAccountServiceImp1()
    {
        return new AccountServiceImp1();
    }
}

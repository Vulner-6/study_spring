package com.study_spring.factory;

import com.study_spring.service.AccountServiceImp1;

/**
 * 如果第三方的jar包中，使用静态方法创建了对象，那么spring中的bean标签该如何获取呢？
 * 思路就是：直接使用工厂类的静态方法，将其写入bean标签
 */
public class StaticFactory
{
    public static AccountServiceImp1 getAccountServiceImp1()
    {
        return new AccountServiceImp1();
    }
}

package com.study_spring.ui;

import com.study_spring.factory.BeanFactory;
import com.study_spring.service.AccountServiceImp1;

/**
 * 模拟终端
 */
public class Client
{
    public static void main(String[] args)
    {
        AccountServiceImp1 as= (AccountServiceImp1) BeanFactory.getBean("accountService");
    }
}

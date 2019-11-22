package com.study_spring.ui;

import com.study_spring.service.AccountServiceImp3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client3
{
    public static void main(String[] args)
    {
        ApplicationContext ac= new ClassPathXmlApplicationContext("beans.xml");
        AccountServiceImp3 asi=(AccountServiceImp3) ac.getBean("AccountServiceImp3");
    }
}

package com.study_spring.ui;

import com.study_spring.service.AccountServiceImp2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 练习依赖注入
 */
public class Client2
{
    public static void main(String[] args)
    {
        //获取spring核心容器对象
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        //测试获取AccountServiceImp2能否成功
        AccountServiceImp2 asi2=(AccountServiceImp2) ac.getBean("AccountServiceImp2");
        asi2.saveAccount();
    }
}

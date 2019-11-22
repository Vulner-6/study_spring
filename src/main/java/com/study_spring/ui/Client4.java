package com.study_spring.ui;

import com.study_spring.service.ArraySetInjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client4
{
    public static void main(String[] args)
    {
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        ArraySetInjection asi=(ArraySetInjection) ac.getBean("ArraySetInjection");
        asi.echo();
    }
}

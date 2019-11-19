package com.study_spring.ui;

import com.study_spring.service.AccountServiceImp1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟终端
 * 前提：导入spring对应的jar包。由于我太懒，就一次性全都导入了。实际上用到哪个spring包就导入哪个spring包是最好的
 * 获取spring的IOC核心容器，并根据id获取对象
 * 自己写的工厂类，是延迟加载，什么时候获取对象id了，才加载
 * spring使用的是立即加载，只要获取容器对象，就立马读取配置文件，并创建配置文件中配置的对象
 */
public class Client
{
    public static void main(String[] args)
    {
        /*
        //根据自己写的工厂类，读取配置文件，利用反射的方法获取对象实例
        AccountServiceImp1 as= (AccountServiceImp1) BeanFactory.getBean("accountService");
        */
        //1.获取核心容器对象
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");   //这是ApplicationContext的实现类
        //2.第一种情况：根据id获取Bean对象(当目标类有默认无参构造函数时)
        AccountServiceImp1 as =(AccountServiceImp1) ac.getBean("accountService");
        System.out.println("11111111111111111");
        //  第二种情况：当目标没有默认无参构造函数时
        AccountServiceImp1 as2=(AccountServiceImp1) ac.getBean("accountServiceImp1");
        //  第三种情况：调用工厂类的静态方法生成对象
        AccountServiceImp1 as3=(AccountServiceImp1) ac.getBean("staticFactory");
    }

}

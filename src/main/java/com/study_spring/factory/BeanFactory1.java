package com.study_spring.factory;

import java.io.InputStream;
import java.util.Properties;

/**
 * 一个创建Bean对象的组件
 * Bean:计算机英语中“可重用组件的意思”
 * JavaBean：用java语言编写的可重用组件
 *
 * 这个例子用来创建我们的service对象和dao对象的
 *
 * 思路：
 *     1.需要一个配置文件来配置service和dao
 *         配置的内容：唯一标识=>全限定类名
 *     2.读取配置文件信息，利用反射来创建对象
 */
public class BeanFactory1
{
    //定义一个Properties对象
    private static Properties props;
    //静态代码块读取配置文件
    static
    {
        try
        {
            //实例化对象
            props=new Properties();
            //获取properties文件的流对象,下面的方式最好。因为web一旦部署，可能就没有src那一层目录了。
            InputStream in= BeanFactory1.class.getClassLoader().getResourceAsStream("bean.properties");
            props.load(in);
        }
        catch (Exception e)
        {
            throw new ExceptionInInitializerError("初始化properties失败");
        }
    }

    //编写工厂的getBean方法，返回实例化对象
    public static Object getBean(String beanName)
    {
        Object bean=null;
        try
        {
            String beanPath=props.getProperty(beanName);    //获取要创造的类的路径
            bean=Class.forName(beanPath).newInstance();    //实例化获取到的类
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return bean;
    }
}

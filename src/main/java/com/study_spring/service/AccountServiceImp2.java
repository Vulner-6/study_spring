package com.study_spring.service;

import java.util.Date;

/**
 * 用于练习依赖注入
 * ioc用于降低程序耦合
 * 依赖关系的管理
 *     依靠spring来管理依赖关系，在当前类中需要用到其他类的对象，由spring为我们提供，我们只需要在配置文件中说明。
 * 依赖关系的维护
 *     依赖注入(dependence injection)
 *     能注入的数据：三类
 *         基本类型和String
 *         其他bean类型（在配置文件中，或注解中配置过的bean）
 *         复杂类型/集合类型
 *     注入的方式有三种：
 *         第一种：使用构造函数提供
 *         第二种：使用set方法提供
 *         第三种：使用注解提供
 */
public class AccountServiceImp2
{
    private String name=null;
    private Integer age=null;
    private Date birthday=null;

    public AccountServiceImp2(String name,Integer age,Date birthday)
    {
        this.name=name;
        this.age=age;
        this.birthday=birthday;
    }

    public void saveAccount()
    {
        System.out.println("spring 依赖注入的值："+this.name+this.age+this.birthday);
    }
}

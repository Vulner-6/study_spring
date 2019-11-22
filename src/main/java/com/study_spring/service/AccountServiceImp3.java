package com.study_spring.service;

import java.util.Date;

/**
 * 测试set注入的使用
 * 适用场景：类有默认构造方法，并且有set方法
 */
public class AccountServiceImp3
{
    private String name=null;
    private Integer age=null;
    private Date birthday=null;

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }
}

package com.study_spring.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 需要都设置set方法，bean标签中的配置才能对应生效
 * 只要是list结构的，那么bean文件中的list标签通用。
 * 只要是map结构的，那么bean文件中的map相关标签也是通用
 */
public class ArraySetInjection
{
    private List list=null;
    private Set set=null;
    private Map map=null;

    public void setList(List list)
    {
        this.list = list;
    }

    public void setSet(Set set)
    {
        this.set = set;
    }

    public void setMap(Map map)
    {
        this.map = map;
    }

    public void echo()
    {
        System.out.println(this.list.toString());
        System.out.println(this.set.toString());
        System.out.println(this.map.toString());
    }
}

package com.itheima.health.dao;

import com.itheima.health.pojo.CheckItem;

import java.util.List;

/**
 * @description:
 * @author: yuefeng
 * @time: 2021/2/4 21:18
 */
public interface CheckItemDao {
    List<CheckItem> findAll();
}

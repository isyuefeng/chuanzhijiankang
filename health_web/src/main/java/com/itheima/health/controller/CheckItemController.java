package com.itheima.health.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.health.constant.MessageConstant;
import com.itheima.health.entity.Result;
import com.itheima.health.pojo.CheckItem;
import com.itheima.health.service.CheckItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author: yuefeng
 * @time: 2021/2/4 19:59
 */
@RestController
@RequestMapping("/checkitem")
public class CheckItemController {

    @Reference

    private CheckItemService checkitemService;

    @GetMapping("/findAll")
    public Result findAll(){

        List<CheckItem> list = checkitemService.findAll();
        return new Result(true, MessageConstant.QUERY_CHECKITEM_SUCCESS,list);
    }
}

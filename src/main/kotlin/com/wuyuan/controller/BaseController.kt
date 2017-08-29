package com.wuyuan.controller

import com.happylifeplat.Result
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by xuwuyuan on 2017/8/29.
 */
@RestController
@RequestMapping("/base")
class BaseController {

    @GetMapping("/hello")
    fun getBaseHello(): Result {
        return Result.success("测试提交")
    }
}
package com.wuyuan.controller

import com.ctrip.framework.apollo.spring.annotation.ApolloConfig
import com.happylifeplat.Result
import com.wuyuan.config.ApolloCustomConfig
import com.wuyuan.mapper.BaseMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.inject.Inject

/**
 * Created by xuwuyuan on 2017/8/29.
 */
@RestController
@RequestMapping("/base")
@Component
class BaseController {

    @GetMapping("/hello")
    fun getBaseHello(): Result {
        val config: ApolloCustomConfig = ApolloCustomConfig()
        return Result.success(config.imagePrefix)
    }
}
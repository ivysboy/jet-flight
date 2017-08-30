package com.wuyuan.mapper

import com.wuyuan.module.ArticleDto

/**
 * Created by xuwuyuan on 2017/8/30.
 */
interface BaseMapper {
    abstract fun getArticles(): List<ArticleDto>
}
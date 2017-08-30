package com.wuyuan.module

import java.util.*

/**
 * Created by xuwuyuan on 2017/8/30.
 */
data class ArticleDto(private var id: String? = null,
                      private var name: String? = null,
                      private var content: String? = null,
                      private var createTime: Date? = null,
                      private var brief: String? = null,
                      private var image: String? = null)
package com.wuyuan.config;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by xuwuyuan on 2017/8/29.
 */
@Component
public class apolloConfig {

    private static final Logger log = LoggerFactory.getLogger(apolloConfig.class);

    @ApolloConfig
    private Config config;

    @Value("${config.imagePrefix}")
    private String imagePrefix;

    @ApolloConfigChangeListener("application")
    private void propChangeHandler(ConfigChangeEvent changeEvent) {
        log.info("======apollo change event = [" + changeEvent.toString() + "]");
        if(changeEvent.isChanged("config.imagePrefix")) {
            imagePrefix = config.getProperty("config.imagePrefix", imagePrefix);
        }
    }

    public String getImagePrefix() {
        return imagePrefix;
    }
}

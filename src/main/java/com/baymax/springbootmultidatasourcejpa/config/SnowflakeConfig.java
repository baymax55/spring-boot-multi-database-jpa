package com.baymax.springbootmultidatasourcejpa.config;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * 雪花算法生成器
 * </p>
 *
 * @description: 雪花算法生成器
 */
@Configuration
public class SnowflakeConfig {
    @Bean
    public Snowflake snowflake(){
        return IdUtil.createSnowflake(1,1);
    }
}

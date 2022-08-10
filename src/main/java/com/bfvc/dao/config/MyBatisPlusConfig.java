package com.bfvc.dao.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: Wenzer
 * @date: 2022-08-10 上午 11:02
 */
@Configuration
public class MyBatisPlusConfig {
    /**
     * 获取MybatisPlus拦截器
     *
     * @return
     */
    @Bean
    public MybatisPlusInterceptor getInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        //启用乐观锁，也就是数据版本号
        interceptor.addInnerInterceptor(new OptimisticLockerInnerInterceptor());
        return interceptor;
    }
}

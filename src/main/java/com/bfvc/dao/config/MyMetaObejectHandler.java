package com.bfvc.dao.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @description:
 * @author: Wenzer
 * @date: 2022-08-10 上午 10:57
 */
@Component
@Slf4j
public class MyMetaObejectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("createTime", new Date(), metaObject);
        this.setFieldValByName("updateTime", new Date(), metaObject);
        this.setFieldValByName("delFlag", 0, metaObject);
        this.setFieldValByName("version", 1, metaObject);
        log.info("Fill while insert done");
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime", new Date(), metaObject);
        log.info("Fill while update done");
    }
}

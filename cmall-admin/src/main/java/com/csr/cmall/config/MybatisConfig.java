package com.csr.cmall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis配置
 * Create by Chen on 2020/10/29
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.csr.cmall.mbg.mapper","com.csr.cmall.dao"})
public class MybatisConfig {
}

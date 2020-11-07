package com.csr.cmall.config;

import com.csr.cmall.common.config.BaseSwaggerConfig;
import com.csr.cmall.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger配置文件 后台管理
 * Create by Chen on 2020/11/3
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {
    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.csr.cmall.controller")
                .title("cmall后台")
                .description("cmall后台接口文档")
                .contactName("chen")
                .version("0.1")
                .build();
    }
}

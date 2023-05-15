package com.aliyun.oss;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;


@Data
//@Component  // ---------------- 不需要扫描这些包，就不用添加注解
@ConfigurationProperties(prefix = "aliyun.oss") //指定前缀, 需要添加依赖
public class AliOSSProperties {
    private String endpoint;
    private String accessKeyId;
    private String accessKeySecret;
    private String bucketName;
}

package com.aliyun.oss;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Spring容器在启动时，会自动加载META-INF.spring中的配置文件（里面的配置类）
 *  直接导入到Spring的 IOC容器中， 项目中使用直接注入Bean对象
 */
@Configuration // 自动配置类
@EnableConfigurationProperties(AliOSSProperties.class) //指定将哪一个类 导入进来
public class AliOSSAutoConfiguration {

    //配置 AliOSSUtils 工具类（原类中没有使用 @Component） 的Bean对象
    @Bean
    public AliOSSUtils aliOSSUtils(AliOSSProperties aliOSSProperties){
        AliOSSUtils aliOSSUtils = new AliOSSUtils();
        aliOSSUtils.setAliOSSProperties(aliOSSProperties);

        return aliOSSUtils;
    }



}

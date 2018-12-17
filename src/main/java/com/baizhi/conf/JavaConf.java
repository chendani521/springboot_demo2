package com.baizhi.conf;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration/*声明当前的类是一个配置类*/

/*在这里面我们要配置datesource数据源*/
public class JavaConf {

    @Bean/*框架扫到这个注解就知道要把返回值对象交由工厂管理了*/
    @ConfigurationProperties(prefix = "jdbc")

    public DruidDataSource getDruidDataSource() {
        /*ctrl+alt+v可以提取要创建的对象,当然要借助return new druidDataSource()*/
        DruidDataSource druidDataSource = new DruidDataSource();
        return druidDataSource;
    }
}

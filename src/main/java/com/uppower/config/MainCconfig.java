package com.uppower.config;

//import com.alibaba.druid.pool.DruidDataSource;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.*;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.stereotype.Controller;
//import org.springframework.transaction.PlatformTransactionManager;
//
//import javax.sql.DataSource;
//
///**
// * @author ：牟神箭
// * @date ：Created in 2020/7/1 16:31
// * @description：配置类
// * @modified By：
// * @version: 1.0.0$
// */
//@Configuration
//@ComponentScans(
//        value = {
//                @ComponentScan(value = "com.uppower", excludeFilters = {
//                        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class}),
//                }, useDefaultFilters = false)
//        }
//)
//@PropertySource("classpath:/dbconfig.properties")
//public class MainCconfig {
//
//    @Value("${db.user}")
//    private String user;
//
//    @Value("${db.password}")
//    private String Password;
//
//    @Value("${db.driverClass}")
//    private String driverClass;
//
//    @Value("${db.url}")
//    private String url;
//
//
//    @Profile("test")
//    @Bean("testDataSource")
//    public DataSource dataSourceTest() throws Exception{
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setName(user);
//        dataSource.setPassword(Password);
//        dataSource.setDriverClassName(driverClass);
//        dataSource.setUrl(url);
//        return dataSource;
//    }
//
//
//    //注册事务管理器在容器中
//    @Bean
//    public PlatformTransactionManager transactionManager() throws Exception {
//        return new DataSourceTransactionManager(dataSourceTest());
//    }
//
//}

package com.bc.ebiz.user.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: banchun
 * Date:  2017-05-10
 * Time:  下午 3:41.
 * Description:
 * To change this template use File | Settings | File Templates.
 */
@EnableDiscoveryClient
@EnableConfigurationProperties
@EnableCaching
//@EnableWebMvc //加了这个影响静态文件访问
@EnableScheduling
@EnableAsync
@EnableTransactionManagement
//@EnableSpringDataWebSupport
@SpringBootApplication
@ComponentScan(value = {"com.bc.ebiz.user"})
@MapperScan(value = {"com.bc.ebiz.user"})
//@EnableMongoRepositories(basePackages = "com.mamahao.ebiz.user.persist.repository.mongo",repositoryFactoryBeanClass = BaseMongoRepositoryFactoryBean.class)
@EnableHystrix
@EnableHystrixDashboard
public class UserApplicationRunner implements CommandLineRunner{

    private static Logger logger = Logger.getLogger(UserApplicationRunner.class.getName());

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(UserApplicationRunner.class);

        application.setRegisterShutdownHook(true);

        application.run(args);

        Runtime.getRuntime().addShutdownHook(new Thread(){

            @Override
            public void run() {
                logger.warning("******************************DiscoveryServer shutdown******************************");
            }
        });
    }

    @Override
    public void run(String... strings) throws Exception {
        logger.warning("******************************DiscoveryServer startup******************************");
    }
}

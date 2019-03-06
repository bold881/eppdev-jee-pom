/* FileName: Application.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Apache License 2.0
 */

package cn.eppdev.jee;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author fan.hao
 */
@SpringBootApplication
@MapperScan("cn.eppdev.jee.conf.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

}

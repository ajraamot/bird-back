package com.example.BirdApp.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created by araam on 9/14/17.
 * This is based on code from the pluralsight course CreatingFirstSpringBootApplication
 * I also updated the bottom of application.properties with some flyway configurations to go with this.
 */
@Configuration
public class PeristenceConfig_ps {
    @Bean
    @ConfigurationProperties(prefix="spring.datasource")
    @Primary
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

//    @Bean
//    @ConfigurationProperties(prefix="datasource.flyway")
//    @FlywayDataSource
//    public DataSource flywayDataSource() {
//        return DataSourceBuilder.create().build();
//    }
}

package com.example.SpringBootApp.config;

import com.example.SpringBootApp.profile.DevProfile;
import com.example.SpringBootApp.profile.ProductionProfile;
import com.example.SpringBootApp.profile.SystemProfile;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    @ConditionalOnProperty(value = "example.profile.dev", havingValue = "true")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(value = "example.profile.dev", havingValue = "false")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}

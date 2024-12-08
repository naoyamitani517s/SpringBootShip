package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class APIConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**") // `/api/**` のパスに CORS を適用
                        .allowedOrigins("http://127.0.0.1:3000") // Next.js のオリジン
                        .allowedMethods("GET", "POST", "PUT", "DELETE") // 許可する HTTP メソッド
                        .allowedHeaders("*") // 許可するヘッダー
                        .allowCredentials(true); // Cookie を許可する場合
            }
        };
    }
}

package com.horsefi.horsemain.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Chenlingu
 * @version V1.0
 * @date Created in 18:17 2021/6/7
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Horse Main")
                .description("Horse Main")
                .version("版本：1.0")
                .contact(new Contact("Hansi", "https://github.com/HansiChan/", "hansi1994822@gmail.com"))
                .build();
    }

    @Bean
    public Docket createD() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.horsefi.horsemain.controller"))
                .build();
    }
}
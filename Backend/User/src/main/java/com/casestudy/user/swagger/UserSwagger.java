package com.casestudy.user.swagger;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class UserSwagger {
	@Bean
	public Docket config() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				//.apis(RequestHandlerSelectors.any())
				.apis(RequestHandlerSelectors.basePackage("com.casestudy.user"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiDetails());
	}
	
	private ApiInfo apiDetails() {
        return new ApiInfo("User Service API",
                "User details ",
                "1.0",
                "",
                new springfox.documentation.service.Contact("Anugraha","www.user.com",""),
                "API License","",
                Collections.emptyList());
	}

	

}

package com.casestudy.payment.swagger;

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
public class PaymentSwagger {
	@Bean
	public Docket config() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.casestudy.payment"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiDetails());
	}
	
	private ApiInfo apiDetails() {
        return new ApiInfo("Payment Service API",
                "Payment details ",
                "1.0",
                "",
                new springfox.documentation.service.Contact("Anugraha","www.payment.com",""),
                "API License","",
                Collections.emptyList());
	}
	
}

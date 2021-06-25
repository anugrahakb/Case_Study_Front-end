package com.casestudy.apigateway.swagger;

import java.util.ArrayList;
import java.util.List;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@EnableAutoConfiguration
public class ApiSwagger implements SwaggerResourcesProvider{
	
	@Override
	public List<SwaggerResource>get(){
		List<SwaggerResource> resources=new ArrayList<>();
		
		resources.add(swaggerResource("Product-Service","/PRODUCT-SERVICE/v2/api-docs","2.0"));
		resources.add(swaggerResource("User-Service","/USER-SERVICE/v2/api-docs","2.0"));
		resources.add(swaggerResource("Order-Service","/ORDER-SERVICE/v2/api-docs","2.0"));
		resources.add(swaggerResource("Cart-Service","/CART-SERVICE/v2/api-docs","2.0"));
		return resources;	
	}
	private SwaggerResource swaggerResource(String name, String location, String version) {
		SwaggerResource swaggerResource= new SwaggerResource();
		swaggerResource.setName(name);
		swaggerResource.setLocation(location);
		swaggerResource.setSwaggerVersion(version);
		return swaggerResource;
	}
}

package com.joelgtsantos.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.joelgtsantos.gateway.api.v1.model.EntityB;
import com.joelgtsantos.gateway.api.v1.model.EntityC;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.spring.autoconfigure.MeterRegistryCustomizer;

@SpringBootApplication
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
	
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Bean
	public EntityB[] getServiceB(RestTemplate restTemplate) {
		EntityB[] entityBList = restTemplate.getForObject("http://localhost:8081/api/v1/b", EntityB[].class);
		return entityBList;
	}
	
	@Bean
	public EntityC[] getServiceC(RestTemplate restTemplate) {
		EntityC[] entityCList = restTemplate.getForObject("http://localhost:8082/api/v1/c", EntityC[].class);
		return entityCList;
	}
	
	@Bean
    MeterRegistryCustomizer<MeterRegistry> metricsCommonTags() {
        return registry -> {
            registry.config().commonTags("application", "rurocker_metrics_service");
        };
    }
}

//package com.h.ti.conf;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.oas.annotations.EnableOpenApi;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//
//@Configuration
//@EnableOpenApi
//public class SwaggerConfig {
//
//    @Bean
//    public Docket docket(){
//        return new Docket(DocumentationType.OAS_30)
//                .apiInfo(new ApiInfo("","","","","","","")).enable(true)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.h.ti"))
////                .apths(PathSelectors.any())
//                .build();
//    }
//}

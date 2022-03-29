
package com.tienda;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.templatemode.TemplateMode;

@Configuration
public class TemplateResolverConfiguration {

    @Bean
    public SpringResourceTemplateResolver templateResolver_0() {//objeto para resolver las busquedas de paginas en las carpetas
        SpringResourceTemplateResolver plantillaResolver
                = new SpringResourceTemplateResolver();
        plantillaResolver.setPrefix("classpath:/templates");
        plantillaResolver.setSuffix(".html");
        plantillaResolver.setTemplateMode(TemplateMode.HTML);
        plantillaResolver.setCharacterEncoding("UTF-8");
        plantillaResolver.setOrder(0);
        plantillaResolver.setCheckExistence(true);
        return plantillaResolver;
    }
    
    @Bean
    public SpringResourceTemplateResolver templateResolver_1() {
        SpringResourceTemplateResolver plantillaResolver
                = new SpringResourceTemplateResolver();
        plantillaResolver.setPrefix("templates/categoria/");
        plantillaResolver.setSuffix(".html");
        plantillaResolver.setTemplateMode(TemplateMode.HTML);
        plantillaResolver.setCharacterEncoding("UTF-8");
        plantillaResolver.setOrder(1);
        plantillaResolver.setCheckExistence(true);
        return plantillaResolver;
    }
    
    @Bean
    public SpringResourceTemplateResolver templateResolver_2() {
        SpringResourceTemplateResolver plantillaResolver
                = new SpringResourceTemplateResolver();
        plantillaResolver.setPrefix("templates/articulo/");
        plantillaResolver.setSuffix(".html");
        plantillaResolver.setTemplateMode(TemplateMode.HTML);
        plantillaResolver.setCharacterEncoding("UTF-8");
        plantillaResolver.setOrder(2);
        plantillaResolver.setCheckExistence(true);
        return plantillaResolver;
    }
    
    @Bean
    public SpringResourceTemplateResolver templateResolver_3() {
        SpringResourceTemplateResolver plantillaResolver
                = new SpringResourceTemplateResolver();
        plantillaResolver.setPrefix("templates/cliente/");
        plantillaResolver.setSuffix(".html");
        plantillaResolver.setTemplateMode(TemplateMode.HTML);
        plantillaResolver.setCharacterEncoding("UTF-8");
        plantillaResolver.setOrder(3);
        plantillaResolver.setCheckExistence(true);
        return plantillaResolver;
    }
}

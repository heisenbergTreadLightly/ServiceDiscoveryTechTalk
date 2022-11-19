package com.epam.driver.setup;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.eapm")
public class WebMvcConfig extends org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport {

}



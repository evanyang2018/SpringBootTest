package com.example.demo.Test1.springELtest;


import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("com.example.demo.Test1.springELtest")
@PropertySource("classpath:springELtest/test.properties")
public class ElConfig {
    @Value("I LOVE YOU")
    private String normal;
    @Value("#{systemProperties['os.name']}")
    private String osName;
    @Value("#{T (java.lang.Math).random()*100.0}")
    private double randomNumber;
    @Value("#{ELDemoService.another}")
    private String fromAnother;
    @Value("classpath:springELtest/test.txt")
    private Resource testFile;
    @Value("http://www.baidu.com")
    private Resource testUrl;
    @Value("${author}")
    private String author;

    @Autowired
    private Environment enviroment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource(){
        try{
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);

            System.out.println(IOUtils.toString(testFile.getInputStream()));

            System.out.println(IOUtils.toString(testUrl.getInputStream()));

            System.out.println(author);

            System.out.println(enviroment.getProperty("author"));


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
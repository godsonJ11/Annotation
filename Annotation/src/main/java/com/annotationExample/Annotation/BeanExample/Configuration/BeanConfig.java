package com.annotationExample.Annotation.BeanExample.Configuration;

import com.annotationExample.Annotation.BeanExample.dto.DemoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanConfig {

    @Bean(name = "godson")
//    @Bean is used for if we want to build the object for the class without any annotation
//    here DemoModel class does not have any annotation like @Com @Ser @Rep
    public DemoModel demoModel(){
        System.out.println("bean godson is created");
        return DemoModel.builder().names("godson")
                .name("j")
                .build();
    }

    @Bean(name ="sunil")
    @Primary
//    primary is used for when
//    multiple bean is declared
//    if we autowired the bean without its name
//    then the primary bean will called
//    example:
//    @Autowired
//    private DemoModel model;
    public DemoModel demoModels(){
        System.out.println("bean sunil is created");
        return DemoModel.builder().names("sunil")
                .name("k")
                .build();
    }


}

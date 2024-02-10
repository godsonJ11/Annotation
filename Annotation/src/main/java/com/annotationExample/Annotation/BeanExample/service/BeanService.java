package com.annotationExample.Annotation.BeanExample.service;

import com.annotationExample.Annotation.BeanExample.dto.DemoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BeanService {
    @Autowired
    @Qualifier("godson")
//    @Qualifier is used to which bean
//    we need to use based on the bean
//    name if we have multiple bean
//    spring ioc container does not know which bean
//    we are using so we use Qualifier to identify the bean
    private DemoModel demoModel;
    @Autowired
    private DemoModel model;
    public void printDemoModel(){
        System.out.println(demoModel);
        System.out.println(model);
    }
}

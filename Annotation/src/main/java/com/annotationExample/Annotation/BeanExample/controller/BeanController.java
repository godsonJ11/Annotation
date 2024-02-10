package com.annotationExample.Annotation.BeanExample.controller;

import com.annotationExample.Annotation.BeanExample.service.BeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanController {
    @Autowired
    private BeanService beanService;
    @PostMapping("/god")
    public void printFirstBean(){
      beanService.printDemoModel();
    }
}

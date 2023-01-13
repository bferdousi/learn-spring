package com.baeldung.ls.config;

import javax.annotation.PreDestroy;

public class BeanB {
    public void initialize() {

    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Pre destroy is called");
    }

    public void destroy() {
        System.out.println("Destroy is called");

    }
}

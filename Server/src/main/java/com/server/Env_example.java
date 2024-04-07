package com.server;// Rename this file to Env.java

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("server.example")
public class Env_example {

    public static String BACKEND_IP = "0.0.0.0";
    
}

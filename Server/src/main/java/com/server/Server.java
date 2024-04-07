package com.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Server {

    public Server(){
    }


    public static void main(String[] args) {
        SpringApplication.run(Server.class, args);
    }

    @RestController
    public static class PingController {

        @GetMapping("/main")
        public String mainPing() {
            return "Main Ping";
        }

        @GetMapping("/task1")
        public String task1Ping() {
            return "Task 1 Ping";
        }

        @GetMapping("/task2")
        public String task2Ping() {
            return "Task 2 works!!!";
        }
    }

}
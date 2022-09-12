package com.training.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

    @RestController
    class MyController{
        @GetMapping(value = "/name")
        public String getName(){
            return  "Vaishnavi Jadhav";
        }


        @GetMapping(value = "/name/{hobby}")
        public String getHobby(@PathVariable("hobby") String hobby){
            return "My hobby is "+hobby;
        }
    }

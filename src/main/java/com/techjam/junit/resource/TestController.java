package com.techjam.junit.resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class TestController {
    
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello";
    }


    @GetMapping(value = "json", produces = MediaType.APPLICATION_JSON_VALUE)
    public Hello json(){
        return new Hello("Hello","Deepak");
    }

    private class Hello{
        private String name;
        private String value;

        public Hello(String name, String value) {
            this.name=name;
            this.value=value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

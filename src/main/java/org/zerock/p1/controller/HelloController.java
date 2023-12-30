package org.zerock.p1.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class HelloController {

    @GetMapping("/hello")
    public void doA() {

        log.info("hello............");


    }

    @GetMapping("/doB")
    public void doB() {
        log.info("doB hello............");
    }

    @GetMapping("/doC")
    public void doC() {
        log.info("doC hello............");
    }

    @GetMapping("/doD")
    public void doD() {
        log.info("ZK202308A doD hello............");
    }

}

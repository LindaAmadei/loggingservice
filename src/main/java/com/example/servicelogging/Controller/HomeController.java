package com.example.servicelogging.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController  {

    Logger logger;

    public HomeController() {
        logger = LoggerFactory.getLogger(HomeController.class);
    }

    @GetMapping("/info")
        public void getInfo(){
        logger.info("This is a INFO logging");

        }

       @GetMapping("/welcome")
       public String welcome(){
        return "welcome";
       }


    @GetMapping("/debug")
    public void getDebug(){
        logger.debug("This is a Debug logging");
        }
}

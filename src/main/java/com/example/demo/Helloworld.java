package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tuanchau on 5/22/2018.
 */
@RestController
public class Helloworld {
        @RequestMapping("/home")
        public String home()
        {
            return "hello world";
        }

}

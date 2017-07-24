package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody

/**
 *  @Controller +@ResponseBody =@RestController
 */

public class IndexController {

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String Index(){
        return "index";
    }

    @RequestMapping(value = {"/girl","/say"},method = RequestMethod.GET)
    public String say(){
        return girlProperties.getCupSize();
    }


}

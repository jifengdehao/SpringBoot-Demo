package com.example.demo;

import javafx.scene.chart.ValueAxis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/two")
public class TestController {

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public String test(){
        return girlProperties.getCupSize();
    }

    @RequestMapping(value = "/test2/{id}",method = RequestMethod.GET)
    public String test2(@PathVariable("id") Integer id){
        return "id："+id;
    }

    @RequestMapping(value = "/{id}/test2",method = RequestMethod.GET)
    public String test3(@PathVariable("id") Integer id){
        return "id："+id;
    }

    /*@RequestMapping(value = "/test2",method = RequestMethod.GET)*/
    @GetMapping(value = "/test2")
   /* @PostMapping()*/

    public String test4(@RequestParam(value = "id",required = false,defaultValue = "0") Integer myId){
        return "id："+myId;
    }
}

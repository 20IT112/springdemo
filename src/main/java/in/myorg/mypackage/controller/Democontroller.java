package in.myorg.mypackage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sun.reflect.generics.tree.Tree;

import java.util.Date;

@RestController

public class Democontroller {
    @GetMapping("/")
    public String welcomeMessage(){
        return "welcome to the world of spring boot!!";
    }

    @GetMapping("/getDate")
    public Date getDate(){
        return new Date();
    }


}

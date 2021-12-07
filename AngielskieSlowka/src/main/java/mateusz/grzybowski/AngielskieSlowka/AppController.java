package mateusz.grzybowski.AngielskieSlowka;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    @GetMapping("/index")
    public String goHome(){
        return "index";
    }
    @GetMapping("/inde")
    public String goHome2(){
        return "hr/index";
    }
    @GetMapping("/index2")
    public String goHomindex2e2(){
        return "index2";
    }
}

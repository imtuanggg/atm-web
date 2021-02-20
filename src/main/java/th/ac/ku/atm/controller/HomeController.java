package th.ac.ku.atm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home") //request /home คืนค่า home template กลับไป
    public String getHomePage(Model model){
        model.addAttribute("greeting", "Sawaddee");
        //return home.html
        return "home";
    }
}

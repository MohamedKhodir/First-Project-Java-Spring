package pl.eduu.vistula.firstprojectjavaspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
@Controller
public class helloController {
    @GetMapping(value = "/")
    public String hello(){return " vistula,in my first spring controller";}

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute( "name", name);
        return "greeting";
    }


}
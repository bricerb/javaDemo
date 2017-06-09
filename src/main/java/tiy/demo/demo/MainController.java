package tiy.demo.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;

/**
 * Created by Brice on 6/2/17.
 */

@Controller
public class MainController {

    @RequestMapping(path = "/testhome", method = RequestMethod.GET)
    public String testHomePage(Model model, HttpSession session){
        System.out.println("ping");
        return "html/test.html";
    }


}

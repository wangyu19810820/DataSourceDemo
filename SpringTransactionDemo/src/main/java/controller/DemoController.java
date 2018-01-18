package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.AService;
import service.BService;
import service.TestService;
import model.TEST;

@RequestMapping("/Demo")
@Controller
public class DemoController {

    @Autowired
    private AService aService;

    @Autowired
    private BService bService;

    @Autowired
    private TestService testService;

    @RequestMapping("/savea")
    @ResponseBody
    public String savea() {
        aService.save();
        return "OK";
    }

    @RequestMapping("/saveb")
    @ResponseBody
    public String saveb() {
        bService.save();
        return "OK";
    }

    @RequestMapping("/saveab")
    @ResponseBody
    public String saveab() {
        aService.saveAB();
        return "OK";
    }

    @RequestMapping("/test")
    @ResponseBody
    public TEST test() {
        return testService.getFirst();
    }

}

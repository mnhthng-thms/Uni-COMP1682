package edu.btechexample.demo.controller;

import edu.btechexample.demo.model.Staff;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @GetMapping("/staff")
    public String staffForm(Model model) {
        model.addAttribute("staff", new Staff());

        // render using `staff` template
        return "staff";
    }

    @PostMapping("/staff")
    public String staffSubmit(@ModelAttribute Staff staff, Model model) {
        model.addAttribute("staff", staff);

        // render using `result` template
        return "result";
    }

    /** Controller for hello-world GET request */
    @RequestMapping("/")
    public String welcome() {
        // render using `index` template
        return "index";
    }
}
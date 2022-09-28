package tryCoding.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tryCoding.app.domain.User;
import tryCoding.app.repo.MessageRepo;

import java.util.HashMap;

@Controller
@RequestMapping("/")
public class MainController {
    private final MessageRepo messageRepo;
    @Autowired
    public MainController(MessageRepo messageRepo) {
        this.messageRepo = messageRepo;
    }

    @GetMapping
    public  String main(Model model, @AuthenticationPrincipal User user){
        var data = new HashMap<Object, Object>();

        data.put("profile", user);
        data.put("message", messageRepo.findAll());
        model.addAttribute("frontendData", data);
        return "index";
    }

}

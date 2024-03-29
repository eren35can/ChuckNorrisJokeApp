package guru.springframework.jokesApp.controllers;

import guru.springframework.jokesApp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class JokesController {

    private JokeService jokeService;


    @Autowired
    public JokesController(JokeService jokeService){
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoked());

        return "chucknorris";
    }

}

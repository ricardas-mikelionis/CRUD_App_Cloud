package mif.vu.lt.Controllers;

import mif.vu.lt.DomainModels.Videogame;
import mif.vu.lt.Services.VideoGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private VideoGameService service;

    @RequestMapping("/")
    public String viewHomePage(Model model) {

        List<Videogame> listVideoGames = service.listAll();
        model.addAttribute("listVideoGames", listVideoGames);

        return "index";
    }

    @RequestMapping("/new")
    public String showNewGamePage(Model model) {
        Videogame videogame = new Videogame();
        model.addAttribute("videoGame", videogame);

        return "new_videoGame";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("videoGame") Videogame videogame) {
        service.save(videogame);

        return "redirect:/";
    }

    @RequestMapping("/edit/{gameID}")
    public ModelAndView showEditProductPage(@PathVariable(name = "gameID") long id) {
        ModelAndView mav = new ModelAndView("edit_videogame");
        Videogame videogame = service.get(id);
        mav.addObject("videoGame", videogame);

        return mav;
    }

    @RequestMapping("/delete/{gameID}")
    public String deleteProduct(@PathVariable(name = "gameID") long id) {
        service.delete(id);
        return "redirect:/";
    }

}

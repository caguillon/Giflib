package com.teamtreehouse.giflib.controller;

import com.teamtreehouse.giflib.data.GifRepository;
import com.teamtreehouse.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Methods in this class should be related to the object the controller
 * refers to (in this case a gif).
 */
@Controller
public class GifController {

    // Reference to a GifRepository object (to gain access)
    @Autowired
    private GifRepository gifRepository;

    /**
     * Method handles requests to our application root.
     */
    @RequestMapping(value = "/")
    public String listGifs(ModelMap modelMap){
        List<Gif> allGifs = gifRepository.getAllGifs();
        // Returns the string that matches our html template (minus the extension)
        modelMap.put("gifs", allGifs);
        return "home";
    }

    // URL -> http://localhost:8080/gif/cowboy-coder
    @RequestMapping(value = "/gif/{name}")
    public String gifDetails(@PathVariable String name, ModelMap modelMap){
        Gif gif = gifRepository.findByName(name);
        modelMap.put("gif", gif);
        return "gif-details";
    }

    @RequestMapping(value = "/favorites")
    public String favoriteGifs(ModelMap modelMap){
        List<Gif> allFavorites = gifRepository.findAllFavorites();
        modelMap.put("gifs", allFavorites);
        return "favorites";
    }

    @RequestMapping(value = "/search")
    public String searchForGif(@RequestParam("q") String searchTerm, ModelMap modelMap){
        List<Gif> matchedGifs = gifRepository.search(searchTerm);
        modelMap.put("gifs", matchedGifs);
        return "home";
    }

}

package com.teamtreehouse.giflib.controller;

import com.teamtreehouse.giflib.data.GifRepository;
import com.teamtreehouse.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

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
    public String listGifs(){
        // Returns the string that matches our html template (minus the extension)
        return "home";
    }

    @RequestMapping(value = "/gif")
    public String gifDetails(ModelMap modelMap){
        Gif gif = gifRepository.findByName("cowboy-coder");
        modelMap.put("gif", gif);
        return "gif-details";
    }

}

package com.teamtreehouse.giflib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Methods in this class should be related to the object the controller
 * refers to (in this case a gif).
 */
@Controller
public class GifController {

    /**
     * Method handles requests to our application root.
     */
    @RequestMapping(value = "/")
    public String listGifs(){
        // Returns the string that matches our html template (minus the extension)
        return "home";
    }

    @RequestMapping(value = "/gif")
    @ResponseBody
    public String gifURI(){
        return "Captured URI/gif!";
    }

}

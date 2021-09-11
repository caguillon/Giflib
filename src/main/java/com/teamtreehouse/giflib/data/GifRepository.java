package com.teamtreehouse.giflib.data;

import com.teamtreehouse.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {

    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", LocalDate.of(2015,2,13), "Shang Chi", true),
            new Gif("ben-and-mike", LocalDate.of(2015,10,30), "Spider-Man", false),
            new Gif("book-dominos", LocalDate.of(2015,9,15), "Wanda", false),
            new Gif("compiler-bot", LocalDate.of(2015,2,13), "Ada Lovelace", true),
            new Gif("cowboy-coder", LocalDate.of(2015,2,13), "Grace Hopper", true),
            new Gif("infinite-andrew", LocalDate.of(2015,8,23), "Loki", false)
    );

    public Gif findByName(String name){
        for(Gif gif: ALL_GIFS){
            if(gif.getName().equals(name)){
                return gif;
            }
        }
        return null;
    }

}

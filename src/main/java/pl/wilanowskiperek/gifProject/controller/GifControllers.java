package pl.wilanowskiperek.gifProject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.wilanowskiperek.gifProject.model.Gif;
import pl.wilanowskiperek.gifProject.repository.GifRepository;

import java.util.List;

@Controller
public class GifControllers {

    private static final Logger LOG = LoggerFactory.getLogger(GifControllers.class);

    @Autowired
    GifRepository gifRepository

            @GetMapping
    public String showGifs(@RequestParam(required = false) String q, ModelMap modelMap) {
            LOG.info("user is showing gifs with q={}", q);
                List<Gif> gifs;
                if (q != null) {
                }else {

                }
            gifs = gifRepository.getAllGifs()){

                }
    }
}

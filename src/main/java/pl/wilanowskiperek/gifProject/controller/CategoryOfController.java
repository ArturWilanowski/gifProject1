package pl.wilanowskiperek.gifProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.wilanowskiperek.gifProject.model.Category;
import pl.wilanowskiperek.gifProject.repository.GifRepository;

@Controller
public class CategoryOfController {

    @Autowired
    GifRepository gifRepository;

  @GetMapping("/categories")
  public String showAllCategories(ModelMap modelMap) {
      Category category = new Category();
      modelMap.addAttribute("categories", category);
    return "categories";
  }





}

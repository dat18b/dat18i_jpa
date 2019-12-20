package kea.clbo.controller;


import kea.clbo.model.Category;
import kea.clbo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class RecipeController {

    CategoryRepository categoryRepository;

    public RecipeController(CategoryRepository xx){
        categoryRepository = xx;
    }

    @GetMapping("/")
    public @ResponseBody Optional<Category> index(){

        return categoryRepository.findByDescription("American");
    }

}

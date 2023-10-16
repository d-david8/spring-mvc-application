package com.ddavid8.demo.controllers;


import com.ddavid8.demo.models.Recipe;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RecipeController {

    private List<Recipe> recipes = new ArrayList<>();

    @GetMapping("/recipes")
    public String listRecipes(Model model) {
        model.addAttribute("recipes", recipes);
        return "recipes";
    }

    @GetMapping("/recipe/add")
    public String addRecipeForm(Model model) {
        model.addAttribute("recipe", new Recipe());
        System.out.println("aaaa");
        return "addRecipe";
    }

    @PostMapping("/recipe/add")
    public String addRecipe(@ModelAttribute Recipe recipe) {
        recipes.add(recipe);
        return "redirect:/recipes";
    }
}

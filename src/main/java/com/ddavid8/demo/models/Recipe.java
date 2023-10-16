package com.ddavid8.demo.models;

import lombok.Data;

@Data
public class Recipe {
    private String title;
    private String ingredients;
    private String description;
    private String preparationSteps;
    private int cookingTime;
}

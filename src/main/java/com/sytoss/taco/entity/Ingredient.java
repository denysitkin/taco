package com.sytoss.taco.entity;

import lombok.*;

import java.lang.reflect.*;

@Data
@RequiredArgsConstructor
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;
    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
      }
}

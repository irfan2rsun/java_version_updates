package com.cydeo.helpzfarmer;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Apple {

    private int weight;
    private Color color;
    private String name;
}
/*
    In software engineering, user requirements will change.
    Example : Imagine an application to help a farmer understand his inventory.
    - Find all green apples in the inventory
    - Find all apples heavier than 200 g
    As a developer, we have to minimize our engineering effort.

*/
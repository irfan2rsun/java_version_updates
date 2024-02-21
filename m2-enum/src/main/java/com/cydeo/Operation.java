package com.cydeo;

public enum Operation {//no business method in enum but only constructor&getter
    PLUS,MINUS,MULTIPLY,DIVIDE;

    Operation() {//this constructor is always private
        System.out.println("Constructor");
    }
}

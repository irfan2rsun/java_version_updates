package com.cydeo;

public class Main {
    //enum class can't be abstract because it's method and variables are final

    public static void main(String[] args) {

        Apple a = new Apple(5);

        System.out.println("How to access a constant");

        Currency c = Currency.DIME;
        System.out.println(c);//to string method is already override
        System.out.println(Currency.PENNY);
        // Apple a = new Apple();
        //System.out.println(a); will print memory space name

        System.out.println("How to get all constants");
        Currency[] currencies = Currency.values(); // Arrays of that constant, we don't use new key word in enum

        for (Currency currency : currencies) {
            System.out.println(currency);
        }

        System.out.println("How to use switch-case with enums");

        Currency myCurrency = Currency.QUARTER;
        switch (myCurrency) {
            case PENNY:
                System.out.println("It is 1 cent");
                break;
            case NICKLE:
                System.out.println("It is 5 cent");
                break;
            case DIME:
                System.out.println("It is 10 cent");
                break;
            case QUARTER:
                System.out.println("It is 25 cent");
                break;
        }


        System.out.println("Operation Task");

        calculate(3, 5, Operation.PLUS);

        System.out.println("How to retrieve the constant value");
        System.out.println(Currency.PENNY.getValue());// how we can call method. we need to create obj.
        System.out.println(Currency.QUARTER.getValue());
        System.out.println(Currency.QUARTER.ordinal());//index num of constant
    }

    private static void calculate(double x, double y, Operation operation) {


        switch (operation) {
            case PLUS:
                System.out.println(x + y);
                break;
            case MINUS:
                System.out.println(x - y);
                break;
            case MULTIPLY:
                System.out.println(x * y);
                break;
            case DIVIDE:
                System.out.println(x / y);
                break;
        }
    }
}


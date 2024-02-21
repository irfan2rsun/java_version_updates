package com.cydeo;

public class Main {

    public static void main(String[] args) {

        System.out.println("How to access a constant");

        Currency c = Currency.DIME;
        System.out.println(c);//to string method is already override
        System.out.println(Currency.PENNY);
        // Apple a = new Apple();
        //System.out.println(a); will print memory space name

        System.out.println("How to get all constants");
        Currency [] currencies = Currency.values(); // Arrays of that constant, we don't use new key word in enum

        for (Currency currency : currencies){
            System.out.println(currency);
        }
    }
}

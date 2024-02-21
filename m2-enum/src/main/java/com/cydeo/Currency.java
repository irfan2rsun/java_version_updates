package com.cydeo;

public enum Currency {//enum is a special class only hold
    PENNY(1),NICKLE(5),DIME(10),QUARTER(25); //PENNY is an OBJ of Currency class...
    // PENNY("This is how we assign value to constants")

    private int value;//encapsulate the value as always

    Currency(int value) {
        this.value = value;
    }

    public int getValue() {//after encapsulation then we need a constructor and a getter
        return value;
    }
}

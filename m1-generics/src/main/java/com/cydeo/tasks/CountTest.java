package com.cydeo.tasks;

import java.util.*;

public class CountTest {
    public static void main(String[] args) {

        List<Integer> ci = Arrays.asList(1, 2, 3, 4);
        int count = countIf(ci, new OddPredicate());//implementing new OddPredicate
        System.out.println("Number of odd integers = " + count);


//     Why I need generic??

/*     Because right now if I only build one way, it will execute only oddPredicate and I can only find the oddNumber
    however if I add another implementation class which is evenPredicate & primePredicate how am I going make sure
    that method it's going to accept those classes as well, that's why we need generic*/

    }

    private static <T> int countIf(List<T> c, UnaryPredicate<T> p) {//UnaryPredicate is polymorphism

/*    Hey, wou wrote a method which is one of the parameter accepting an obj belongs to OddPredicate Class, and if you try to
 pass another obj belongs to EvenPredicate Class this method will not accept that obj */
        int count = 0;
        for (T elements : c) {
            if (p.test(elements)) {
                ++count;
            }
        }
        return count;
    }
}

/*

Write a generic method to count the number of elements in a collection that have a specific property (for example, odd
integers, prime numbers).

Use following interface in your solution as well:

public interface UnaryPredicate<T> {
    public boolean test(T obj);
}

Sample output:
List<Integer> ci = Arrays.asList(1, 2, 3, 4);
int count = countIf(ci, new OddPredicate());
System.out.println("Number of odd integers = " + count);

*/




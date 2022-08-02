package schildt_beginner.lyamda;

import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
//        () -> 98.6;

//        (n) -> 1.0 / n;

//        (n) -> (n % 2)==0

//        n -> (n % 2)==0



        // Create a reference to a MyValue instance.
        MyValue myVal;
        // Use a lambda in an assignment context.
        myVal = () -> 98.6;

        // Call getValue(), which is implemented by the previously assigned
        // lambda expression.
        System.out.println("A constant value: " + myVal.getValue());

        MyParamValue myPval = (n) -> 1.0 / n;
        System.out.println("Reciprocal of 4 is " + myPval.getValue(4.0));

        Comparator<String> comp = (first, second) -> first.length() - second.length();



    }
    static double myMeth() { return 98.6; }

}

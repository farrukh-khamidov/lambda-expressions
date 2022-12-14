package schildt_beginner.predefinedinterfaces;

// Use the Predicate built-in functional interface.
// Import the Predicate interface.

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class UsePredicateInterface {
    public static void main(String[] args) {
        // This lambda uses Predicate<Integer> to determine
            // if a number is even.
        Predicate<Integer> isEven = (n) -> (n % 2) == 0;
        if (isEven.test(4)) System.out.println("4 is even");
        if (!isEven.test(5)) System.out.println("5 is odd");

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.forEach(new ConsumerImpl());

    }
}

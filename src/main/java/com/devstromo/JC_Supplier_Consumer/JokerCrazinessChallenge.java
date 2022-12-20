package com.devstromo.JC_Supplier_Consumer;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class JokerCrazinessChallenge {
    static int jokerCraziness = 0;

    public static void main(String... doYourBest) {
        Supplier<Integer> supplier = () -> jokerCraziness++;
        Consumer<Integer> consumer = (batmanAttack) -> System.out.println(batmanAttack + jokerCraziness++);

        System.out.println(jokerCraziness + supplier.get());
        consumer.accept(1);
    }
}

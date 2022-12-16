package com.devstromo.JC_68;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class JediDarkSideFight {

    public static void main(String... doYourBest) {
        String luke = "useSaber";
        Supplier<String> yoda = () -> "useForce";

        UnaryOperator<String> fightEmpire = luke::concat;
        UnaryOperator<String> fightDarkSide = String::toUpperCase;

        BiFunction<UnaryOperator<String>, UnaryOperator<String>, Function<String, String>> attackDarkSide = Function::andThen;

        System.out.println(fightDarkSide.apply(fightEmpire.apply(yoda.get())));
        String finalAttack = attackDarkSide.apply(fightEmpire, fightDarkSide).apply(yoda.get());
        Consumer<String> consumerForce = System.out::println;
        consumerForce.accept(finalAttack);
    }
}

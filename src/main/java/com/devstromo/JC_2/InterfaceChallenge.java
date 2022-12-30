package com.devstromo.JC_2;

import java.util.function.Function;

public class InterfaceChallenge {

    interface Jedi {
        String MASTER = "Yoda";

        default String attack() {
            return jump(jedi -> String.join(jedi, useSaber(), useForce()));
        }

        private static String useSaber() {
            return "S";
        }

        private String useForce() {
            return "F";
        }

        private String jump(Function<String, String> function) {
            return function.apply("Luke");
        }

        static void main(String... startWars) {
            System.out.println(new Jedi() {
                public String useForce() {
                    return "X";
                }
            }.attack() + Jedi.useSaber() + Jedi.MASTER);
        }
    }
}

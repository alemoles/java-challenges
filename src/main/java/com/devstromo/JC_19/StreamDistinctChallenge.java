package com.devstromo.JC_19;

import java.util.List;

public class StreamDistinctChallenge {
    public static void main(String... doYourBest) {
        List<Warrior> warriors = List.of(new Warrior("Ezio"), new Warrior("Ezio"), new Warrior("Kratos"), new Warrior("Cloud"), new Warrior("Alucard"));
        warriors.stream()
            .distinct()
            .forEach(w -> System.out.println(w.name));
    }

    static class Warrior {
        private String name;

        public Warrior(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            return this.name.equals(((Warrior) o).name);
        }

        @Override
        public int hashCode() {
            return this.name.length();
        }
    }
}

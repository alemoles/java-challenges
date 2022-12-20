package com.devstromo.JC_27;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class EqualsHashCodeChallenge {

    public static void main(String... doYourBest) {
        System.out.println(new Simpson("Bart").equals(new Simpson("Bart")));
        Simpson overriddenHomer = new Simpson("Homer") {
            @Override
            public int hashCode() {
                return (43 + 777) + 1;
            }
        };
        System.out.println(new Simpson("Homer").equals(overriddenHomer));
        var set = new HashSet<>(Set.of(new Simpson("Homer"), new Simpson("Marge")));
        set.add(new Simpson("Homer"));
        set.add(overriddenHomer);
        System.out.println(set.size());
    }

    static class Simpson {
        String name;

        public Simpson(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Simpson simpson = (Simpson) o;
            return this.name.equals(simpson.name) && this.hashCode() == simpson.hashCode();
        }

        @Override
        public int hashCode() {
            return (43 + 777);
        }
    }
}

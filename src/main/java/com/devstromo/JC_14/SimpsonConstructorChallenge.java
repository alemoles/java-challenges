package com.devstromo.JC_14;

public class SimpsonConstructorChallenge {

    public static void main(String[] args) {
        Simpson simpson = new Simpson("Bart", 8);
        System.out.println(simpson.name + "," + simpson.age);
    }

    static abstract class Character {
        String name;
        int age = 35;

        static {
            System.out.println("D'oh");
        }

        public Character(String name, int age) {
            this.name = name;
            this.age = this.age;
            System.out.println("character");
        }
    }

    static class Simpson extends Character {
        public Simpson(String name, int age) {
            super(name, age);
            System.out.println("simpson");
        }
    }
}

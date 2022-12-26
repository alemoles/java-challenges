package com.devstromo.JC_38;

public class MethodReferenceVSLambdaChallenge {

    public static void main(String... doYourBest) {
        Runnable universeImpactRunnable = () -> new ChuckNorris().roundHouseKick();
        Runnable galaxyImpactRunnable = new ChuckNorris()::roundHouseKick;
        System.out.println("The galaxy is finished = ");

        universeImpactRunnable.run();
        universeImpactRunnable.run();

        galaxyImpactRunnable.run();
        galaxyImpactRunnable.run();
    }

    static class ChuckNorris {
        private static int numberOfKicks;
        private int galaxyDamage;

        public ChuckNorris() {
            this.galaxyDamage = numberOfKicks++;
        }

        void roundHouseKick() {
            System.out.println(this.galaxyDamage);
        }
    }
}

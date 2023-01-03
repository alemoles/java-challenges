package com.devstromo.JC_18;

public class FlowControlChallenge {
    public static void main(String... doYourBest) {
        boolean isHomeFat;
        boolean isBartPrankster = false;

        int result = 0;

        if (isHomeFat = true || (isBartPrankster = true)) {
            result++;
            isHomeFat = false;
        }
        if (isHomeFat || isBartPrankster && (isBartPrankster = false || isHomeFat)) {
            result++;
        }
        if (!isHomeFat && !isBartPrankster) {
            result++;
        }

        System.out.println(String.valueOf(result) + isHomeFat + isBartPrankster);
    }
}

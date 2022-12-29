package com.devstromo.JC_1;

import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalChallenge {

    static String finalZionValue = "";
    static int matrixCount = 0;

    public static void main(String... matrix) {
        Optional<String> optFromMatrix = Optional.ofNullable(finalZionValue);
        var agentSmith = "Virus";

        finalZionValue += Optional.ofNullable(agentSmith)
            .orElse(getVisionFromOracle());
        finalZionValue += optFromMatrix.orElseGet(OptionalChallenge::getVisionFromOracle);
        finalZionValue += matrixCount;
        String neo = null;

        try {
            Optional.ofNullable(neo)
                .orElseThrow(IllegalArgumentException::new);
        } catch (IllegalArgumentException e) {
            finalZionValue += Optional.ofNullable(neo)
                .or(() -> Optional.of("theOne"))
                .get();
        }

        finalZionValue += Optional.of("trinity")
            .stream()
            .map(String::toUpperCase)
            .filter(trinity -> trinity.equals("TRINITY"))
            .collect(Collectors.joining());
        System.out.println(finalZionValue);
    }

    static String getVisionFromOracle() {
        matrixCount++;
        finalZionValue = "KeyMaker";
        return "Architect";
    }

}

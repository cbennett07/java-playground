package com.galvanize;

import java.util.ArrayList;
import java.util.List;

public class Accumulator {

    int sum(List<Integer> input) {
        int result = 0;

        for (int number : input) {
            result += number;
        }

        return result;
    }

    List<String> longWords(String input, int maxLength) {

        ArrayList<String> result = new ArrayList<>();

        String[] words = input.split(",");

        for (String word : words) {
            if (word.length() > maxLength) {
                result.add(word);
            }

        }
        return result;
    }

    String toSentence(String[] input) {

        String returnVar = "";

        if (input.length == 0 || input[0] == "") {
            return returnVar;
        }
        else {
            for (int i = 0; i < input.length; i++) {
                returnVar += input[i];
                if (i == (input.length-2)){returnVar += " and ";}
                if (i < (input.length-2)){returnVar += ", ";}
            }

            return returnVar;
        }

    }
}
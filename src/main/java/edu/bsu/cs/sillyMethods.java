package edu.bsu.cs;

public class sillyMethods {
    public boolean didGuess42(int i) {
        boolean result = false;
        if (i == 42) {
            result = true;
        }
        return result;
    }

    public String countTo(int i) {
        String result = "";
        for (int j = 0; j <= i-1; j++) {
            String insert = j + " ";
            result = result + insert;
        }
        result = result + i;
        return result;
    }
}

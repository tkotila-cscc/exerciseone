package cscc.tkotila;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String city = "Columbus";
        int zipCode = 43215;
        int[] highTemps = { 32, 25, 27, 40, 45 };
        System.out.printf("City: %s | Zip Code: %d | Average Temperature: %s", city, zipCode,
                Arrays.stream(highTemps).average().getAsDouble());
    }
}
package _1_FirstStepsInCoding.lab;

import java.util.Scanner;

public class _4_InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        double cm = Double.parseDouble(input);

        double inch = cm * 2.54;

        System.out.println(inch);
    }
}

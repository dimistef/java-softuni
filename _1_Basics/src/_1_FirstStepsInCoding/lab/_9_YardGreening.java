package _1_FirstStepsInCoding.lab;

import java.util.Scanner;

public class _9_YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double yardSize = Double.parseDouble(scan.nextLine());

        double priceGreening = yardSize * 7.61;

        double discount = priceGreening * 0.18;

        double finalPrice = priceGreening - discount;

        System.out.printf("The final price is: %.2f lv.%n", finalPrice);
        System.out.printf("The discount is: %.2f lv.", discount);

    }
}

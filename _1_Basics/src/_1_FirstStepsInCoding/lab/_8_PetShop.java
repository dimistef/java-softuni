package _1_FirstStepsInCoding.lab;

import java.util.Scanner;

public class _8_PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double dogs = Double.parseDouble(scan.nextLine());

        double other = Double.parseDouble(scan.nextLine());

        double dogFood = dogs * 2.50;
        double otherFood = other * 4;
        double price = dogFood + otherFood;

        System.out.printf("%.1f lv.", price);
    }
}

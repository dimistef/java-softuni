package _1_FirstStepsInCoding.lab;

import java.util.Scanner;

public class _5_GreetingByName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();

        System.out.print("Hello, " + name + "!");
    }
}

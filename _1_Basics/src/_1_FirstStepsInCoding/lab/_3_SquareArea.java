package _1_FirstStepsInCoding.lab;

import java.util.Scanner;

public class _3_SquareArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int side = Integer.parseInt(input);

        int squareArea = side * side;

        System.out.println(squareArea);
    }
}

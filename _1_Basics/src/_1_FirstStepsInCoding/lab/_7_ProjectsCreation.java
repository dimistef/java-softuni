package _1_FirstStepsInCoding.lab;

import java.util.Scanner;

public class _7_ProjectsCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int numOfProjects = Integer.parseInt(scan.nextLine());

        int time = numOfProjects * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, time, numOfProjects);
    }
}

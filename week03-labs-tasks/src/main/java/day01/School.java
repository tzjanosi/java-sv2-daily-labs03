package day01;

import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Students students =new Students();
        System.out.println("Type in the height (in cm, integer) of the 1st student:");
        int height=scanner.nextInt();
        students.addHeight(height);

        System.out.println("Type in the height (in cm, integer) of the 2nd student:");
        height=scanner.nextInt();
        students.addHeight(height);

        System.out.println("Type in the height (in cm, integer) of the 3rd student:");
        height=scanner.nextInt();
        students.addHeight(height);

        System.out.println();
        System.out.println(students);
        String isIncreasingOutput=students.isHeightsIncreasing()?"The list is increasing":"The list is not increasing";
        System.out.println(isIncreasingOutput);


    }
}

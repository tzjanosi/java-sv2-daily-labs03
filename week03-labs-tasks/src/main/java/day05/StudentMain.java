package day05;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Journal journal=new Journal();

        System.out.println("Type in name of the student:");
        String studentName=scanner.nextLine();
        String output=journal.addStudent(studentName)?studentName+" is registered":"It is NOT a valid name";
        System.out.println(output);
        System.out.println();

        System.out.println("Type in name of the student:");
        studentName=scanner.nextLine();
        output=journal.addStudent(studentName)?studentName+" is registered":"It is NOT a valid name";
        System.out.println(output);
        System.out.println();

        System.out.println("Type in name of the student:");
        studentName=scanner.nextLine();
        output=journal.addStudent(studentName)?studentName+" is registered":"It is NOT a valid name";
        System.out.println(output);
        System.out.println();

        System.out.println(journal);

    }
}

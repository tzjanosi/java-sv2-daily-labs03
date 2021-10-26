package day02;

import java.util.Scanner;

public class MathematicsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a positive long integer number to check:");
        long isPrimNumber=scanner.nextLong();
        Mathematics mathematics =new Mathematics();
        boolean isPrime=mathematics.isPrime(isPrimNumber);
        String outputString= isPrime?"It is prim!":"It is  NOT prim! ";

        System.out.println(outputString);
    }

}

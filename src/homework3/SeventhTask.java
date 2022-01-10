package homework3;

import java.util.Scanner;

public class SeventhTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        System.out.println("Multiplication table for the number " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.print(n * i + " ");

        }
    }
}

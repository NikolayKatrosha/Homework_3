package homework3;

import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number you want to raise to the power: ");
        int x = in.nextInt();
        System.out.println("Enter the degree: ");
        int n = in.nextInt();
        int result = 0;
        result = (int) Math.pow(x, n);
        System.out.println("Your result is: " + result);
    }
}

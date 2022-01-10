package homework3;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {

        System.out.println(Factorial(1));
        System.out.println(Factorial(5));
    }

    public static int Factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }
}
// I decided not to use cycle for. But if it necessary then here's the formula:
//  int result = 1;
//  for (int i=1; i<=number; i++) {
//            result = result*i;
// }
// sout (result)


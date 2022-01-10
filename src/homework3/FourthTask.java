package homework3;

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
// SecondTask using Do-While Loop
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number which factorial do you wanna find:");
        int number = in.nextInt();
        int result = 1;
        int i = 1;
        do {
            result = result * i;
            i++;

        }
        while (i <= number);
        System.out.println("Factorial of " + number + " = " + result);
    }
}

// FirstTask using cycle Do - While

  /*  int i=0;
        do {
                if(i%2!=0){
                System.out.print(i+" ");
                }
                i++;
                }
                while(i<100);
        }
*/
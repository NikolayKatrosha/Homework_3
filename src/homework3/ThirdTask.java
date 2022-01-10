package homework3;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        // SecondTask using While Loop
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number which factorial do you wanna find:");
        int number = in.nextInt();
        int result = 1;
        int i = 1;
        while (i <= number) {
            result = result * i;
            i++;
        }
        System.out.println("Factorial of " + number + " = " + result);
    }

}




// FirstTask using cycle While

        /*int i=0;
        while(i<100){
            if(i%2!=0){
                System.out.print(i+" ");
            }
            i++;
        }*/
package homework3;

import java.util.Scanner;

public class TwelfthTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of array");

        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        double sum = 0;
        for (int i = 0; i < size; i++) {
        sum+= array[i];
        }
        System.out.println("Average of array is: "+ sum/size);
    }
}

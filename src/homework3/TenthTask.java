package homework3;

import java.util.Scanner;

public class TenthTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        int max = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < size; i++) {
            if (max == array[i]) {
                System.out.print(array[i] + " ");
            }
        }
    }
}

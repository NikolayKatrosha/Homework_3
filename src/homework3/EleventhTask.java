package homework3;

import java.util.Scanner;

public class EleventhTask {
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
        int min = array[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        for (int i = 1; i < array.length; ++i) {
            if (array[i] < array[minIndex])
                minIndex = i;
            if (array[i] > array[maxIndex])
                maxIndex = i;
        }
        int swap;
        if (maxIndex != minIndex) {
            swap = array[minIndex];
            array[minIndex] = array[maxIndex];
            array[maxIndex] = swap;
        }
        for(int i : array){
            System.out.print(i+ " ");
        }
    }
}




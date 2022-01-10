package homework3;

public class SixthTask {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        while (i < 10) {
            if (j % 5 == 0) {
                System.out.print(j + " ");
                i++;
            }
            j--;
        }
    }
}

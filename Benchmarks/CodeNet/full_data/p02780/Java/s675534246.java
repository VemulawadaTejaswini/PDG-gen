import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int s = sc.nextInt();
        int[] array = new int[k];

        int i;
        int j;
        double[] arrayExpected = new double[k];
        for (i = 0; i < k; i++) {
            array[i] = sc.nextInt();
            double sum = 0;
            double count = 0;
            for (j = 0; j < array[i]; j++) {
                sum = sum + j + 1;
                count++;
            }
            arrayExpected[i] = sum / count;
        }

        double max = 0;
        for (i = 0; i <= k - s; i++) {
            double sum = 0;
            for (j = i; j < s + i; j++) {
                sum = sum + arrayExpected[j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}
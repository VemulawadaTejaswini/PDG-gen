import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int s = sc.nextInt();
        int[] array = new int[k];
        double a1 = 0;
        double a2 = 0;
        double a3 = 0;
        double max = 0;

        int i;
        int j;
        double[] arrayExpected = new double[k];
        for (i = 0; i < k; i++) {
            int num = sc.nextInt();
            double sum = 0;
            double count = 0;
            for (j = 0; j < num; j++) {
                sum = sum + j + 1;
                count++;
            }
//            a1 = a2;
//            a2 = a3;
            a3 = sum / count;
//            if (a1 + a2 + a3 > max) {
            if (a3 > max) {
                max = a3;
            }
        }

//        for (i = 0; i <= k - s; i++) {
//            double sum = 0;
//            for (j = i; j < s + i; j++) {
//                sum = sum + arrayExpected[j];
//            }
//            if (sum > max) {
//                max = sum;
//            }
//        }
        System.out.println(max);
    }
}
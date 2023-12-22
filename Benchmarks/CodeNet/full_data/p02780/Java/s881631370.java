
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        int max = 0;
        List<Integer> maxs = new ArrayList<>();
        for (int i = 0; i <= p.length - k; i++) {
            int sum = 0;
            List<Integer> sums = new ArrayList<>();
            for (int j = i; j < i + k; j++) {
                sums.add(p[j]);
                sum += p[j];
            }
            if (sum > max) {
                max = sum;
                maxs = sums;
            }
        }

        double sumu = 0;
        for (int num : maxs) {
            double ave = 1 / (double)num;
            for (int i = 1; i <= num; i++) {
                sumu += ave * i;
            }
        }

        System.out.println(sumu);
    }
}
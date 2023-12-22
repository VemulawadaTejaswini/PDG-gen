import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        int[] arr_a;

        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        arr_a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int i = 0;
        for (int a : arr_a) {
            arr_a[i] = a - (i + 1);
            i++;
        }

        Arrays.sort(arr_a);
        int med;
        if (arr_a.length % 2 == 0) {
            int medIndex = arr_a.length / 2;
            med = Math.round((arr_a[medIndex] + arr_a[medIndex]) / 2);
        } else {
            med = arr_a[arr_a.length / 2];
        }

        int sum = 0;
        for (int a : arr_a) {
            sum += Math.abs(a - med);
        }

        int med_u = med + 1;
        int sum_u = 0;
        for (int a : arr_a) {
            sum_u += Math.abs(a - med_u);
        }

        int med_l = med - 1;
        int sum_l = 0;
        for (int a : arr_a) {
            sum_l += Math.abs(a - med_l);
        }

        if (sum > sum_u) sum = sum_u;
        if (sum > sum_l) sum = sum_l;
        System.out.println(sum);
    }
}
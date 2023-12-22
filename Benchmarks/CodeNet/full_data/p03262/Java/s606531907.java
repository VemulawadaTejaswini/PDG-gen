import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (Math.abs(x - input[i]) < max)
                max = Math.abs(x - input[i]);
        }
        System.out.println(max);
    }
}
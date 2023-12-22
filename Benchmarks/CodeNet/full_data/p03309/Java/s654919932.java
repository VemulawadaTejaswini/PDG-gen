import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt() - i;
        }

        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                count += Math.abs(A[i] - A[j]);
            }
            if (count < minimum) {
                minimum = count;
            }
        }

        System.out.println(minimum);
    }
}
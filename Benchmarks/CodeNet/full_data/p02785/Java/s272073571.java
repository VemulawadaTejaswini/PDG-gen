import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC153C - Fennec vs Monster

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // モンスターの数
        int k = sc.nextInt();   // 必殺技の回数

        int[] h = new int[n];

        long hp = 0;
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            hp += h[i];
        }

        Arrays.sort(h);

        if (k > n) k = n;
        
        for (int i = n - 1; i >= n - k; i--) {
            hp -= h[i];
        }

        System.out.println(hp);
    }
}
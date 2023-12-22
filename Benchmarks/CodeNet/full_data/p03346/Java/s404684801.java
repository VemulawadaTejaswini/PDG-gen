import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[sc.nextInt()] = i;
        }
        int cnt = 0;
        int max = 0;
        for (int i = 2; i <= n; i++) {
            if (a[i] > a[i - 1]) {
                cnt++;
            } else {
                max = Math.max(cnt, max);
                cnt = 0;
            }
        }
        max = Math.max(cnt, max);
        System.out.println(n - max - 1);
        //1300
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] l = new int[n];
        for (int i=0;i<n;i++) {
            l[i] = sc.nextInt();
        }

        int result =  1;
        int sum = 0;
        for (int i=0;i<n;i++) {
            sum += l[i];
            if (sum > x) break;
            result++;
        }

        System.out.println(result);
    }
}
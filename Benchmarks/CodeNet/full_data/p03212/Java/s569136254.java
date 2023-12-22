import java.util.Scanner;

public class Main {
    static int n;
    static int k;
    static int[] a = {3,5,7};
    static long count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dfs(0);
        System.out.println(count);
    }
    static void dfs(long i) {
        if (i > n) return;
        if (String.valueOf(i).contains("3")
        && String.valueOf(i).contains("5")
        && String.valueOf(i).contains("7")) {
            System.out.println(i);
            count++;
        }
        for (int j = 0; j < 3; j++) {
            dfs(i*10 + a[j]);
        }
    }
}
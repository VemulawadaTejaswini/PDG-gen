import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < w.length; i++) {
            w[i] = sc.nextInt();
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < w.length; i++) {
            int total1 = 0;
            for (int j = 0; j < i; j++) {
                total1 += w[j];
            }
            int total2 = 0;
            for (int j = i; j < w.length; j++) {
                total2 += w[j];
            }
            int tmp = Math.abs(total2 - total1);
            if(ans > tmp)ans = tmp;
        }
        System.out.println(ans);
    }
}
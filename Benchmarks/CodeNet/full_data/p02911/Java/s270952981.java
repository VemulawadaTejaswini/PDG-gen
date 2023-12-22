import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());

        k -= q;

        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = k;
        }

        for (int i = 0; i < q; i++) {
            int t = Integer.parseInt(sc.next());
            score[t - 1] += 1;
        }

        for (int value : score) {
            if (value > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
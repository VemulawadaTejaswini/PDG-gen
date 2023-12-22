import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();

        int[] w = new int[n];

        for (int i=0; i < n; i++) {
            w[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;

        for (int i=0; i < n; i++) {
            min = Math.min(diff(w, i), min);
        }

        System.out.println(min);
    }

    private static int diff(int[] w, int t) {
        int s1 = 0;
        int s2 = 0;
        for (int i=0; i < w.length; i++) {
            if (i < t) {
                s1 += w[i];
            } else {
                s2 += w[i];
            }
        }

        return Math.abs(s1 - s2);
    }

}

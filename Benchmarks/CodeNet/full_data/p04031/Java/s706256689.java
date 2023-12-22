import java.util.Scanner;

public class Main {

    public static int max_a (int[] array) {
        int val = array[0];
        for (int i = 1; i < array.length; i++) {
            val = Math.max(val, array[i]);
        }

        return val;
    }

    public static int min_a (int[] array) {
        int val = array[0];
        for (int i = 1; i < array.length; i++) {
            val = Math.min(val, array[i]);
        }

        return val;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int maxa = max_a(a);
        int mina = min_a(a);

        int min_cost = Integer.MAX_VALUE;
        for (int i = mina; i <= maxa; i++) {
            int cost = 0;
            for (int j = 0; j < n; j++) {
                 cost += (i - a[j]) * (i - a[j]);
            }
            min_cost = Math.min(min_cost, cost);
        }

        System.out.println(min_cost);
    }
}
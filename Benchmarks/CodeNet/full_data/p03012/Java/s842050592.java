import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] w = new Integer[n];
        for (int i = 0; i < n; i++) {
            w[i] = Integer.parseInt(sc.next());
        }

        int result = 100;
        for (int i = 1; i < n; i++) {
            int s1 = 0;
            for (int j = 0; j < i; j++) {
                s1 += w[j];
            }
            int s2 = 0;
            for (int j = i; j < n; j++) {
                s2 += w[j];
            }
            result = Math.min(result, Math.abs(s1 - s2));
        }
        System.out.println(result);
    }
}
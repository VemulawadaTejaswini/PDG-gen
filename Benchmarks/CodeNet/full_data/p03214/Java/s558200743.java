
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        double sum = 0;
        for (int i = 0; i < n ; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        double av = sum / (double) n;

        double max = 100000;
        int ans = 0;
        for (int i = 0; i < n ; i++) {
                if (Math.abs(av - a[i]) < max) {
                    max = Math.abs(av - a[i]);
                    ans = i;
                }
        }




        System.out.println(ans);
    }

}
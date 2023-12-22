import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int min = 10000000;
        for (int i = -100; i <= 100 ;i++ ) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += Math.pow(a[j]-i, 2);
            }
            min = Math.min(min, sum);
        }
        System.out.println(min);

    }

}
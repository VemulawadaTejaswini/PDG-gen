import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        int count = 0;
        int min = 999999999;

        for (int i = 1; i <= x.length; i++) {
            int counter = 0;
            for (int j = 0; j < x.length; j++) {
                count = x[j] - i;
                counter += count * count;
            }
            min = Math.min(min, counter);
        }
        System.out.println(min);
    }
}
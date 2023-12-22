import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        float ave = 0;
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            ave += x[i];
        }
        ave = Math.round(ave / x.length);

        int count;
        int counter = 0;
        for (int j = 0; j < x.length; j++) {
            count = x[j] - (int) ave;
            counter += count * count;
        }
        System.out.println(counter);
    }
}
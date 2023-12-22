import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double p = 1;
            int score = i;
            while (score < k) {
                score *= 2;
                p /= 2;
            }
            sum += p;
        }
        System.out.println(sum / n);
    }

}

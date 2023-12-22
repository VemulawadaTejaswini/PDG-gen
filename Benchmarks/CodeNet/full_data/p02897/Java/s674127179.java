import java.util.Scanner;

public class Main {
    //Odds of Oddness
    //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double res = 0.0;
        if (n % 2 == 0) {
            res = 1 / 2;
        } else {
            res = (n + 1) / 2;
            res /= n;
        }
        System.out.println(res);
        sc.close();
    }
}

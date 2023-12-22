import java.util.Scanner;

public class Main {
    //Odds of Oddness
    //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float res = 0.0f;
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

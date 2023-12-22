import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int K = s.nextInt();
        int Ans = 0;
        int gcd = 0;
        for (int a = 1; a <= K; a++) {
            for (int b = 1; b <= K; b++) {
                for (int c = 1; c <= K; c++) {
                    gcd = a;
                    while (gcd > 0) {
                        if (gcd == 1) {
                            Ans += gcd;
                            break;
                        } else if (c % gcd == 0 && b % gcd == 0 && a % gcd == 0) {
                            Ans += gcd;
                            break;
                        }
                        gcd -= 1;
                    }
                }
            }
        }
        System.out.println(Ans);
        s.close();
    }
}
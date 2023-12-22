import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = N / 1000;
        int B = N % 1000 / 100;
        int C = N % 100 / 10;
        int D = N % 10;
        double ANS[] = new double[3];
        String tmp[] = new String[3];
        int ans;
        lavel:
        for (ANS[0] = 1; 2 >= ANS[0]; ANS[0]++) {
            for (ANS[1] = 1; 2 >= ANS[1]; ANS[1]++) {
                for (ANS[2] = 1; 2 >= ANS[2]; ANS[2]++) {
                    ans = (int) (A + (Math.pow(-1, ANS[0])) * B + (Math.pow(-1, ANS[1])) * C + (Math.pow(-1, ANS[2])) * D);
                    if (ans == 7) {
                        break lavel;
                    }
                }

            }
        }
        for (int i = 0; 3 > i; i++) {
            if (ANS[i] == 1) {
                tmp[i] = "-";
            } else {
                tmp[i] = "+";
            }
        }
        System.out.println(A + tmp[0] + B + tmp[1] + C + tmp[2] + D + "=7");
    }
}
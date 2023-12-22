
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        long LCM = 1;

        if ((C > D) && (C % D == 0)) {
            LCM = C;
        } else if ((D >= C) && (D % C == 0)) {
            LCM = D;
        } else {
            int i = 2;
            long C_copy = C;
            long D_copy = D;
            long max = C_copy > D_copy ? C_copy : D_copy;
            while (true) {
                if ((C_copy % i == 0) && (D_copy % i == 0)) {
                    C_copy /= i;
                    D_copy /= i;
                    LCM *= i;
                    i = 2;
                    max = C_copy > D_copy ? C_copy : D_copy;
                }
                if (i >= max) {
                    LCM *= C_copy * D_copy;
                    break;
                }
                i++;
            }
        }

        long res = (B - B / C - B / D + B / LCM) - (A - A / C - A / D + A / LCM);
        if ((A % C != 0) && (A % D != 0)) {
            res++;
        }
        System.out.println(res);
    }
}

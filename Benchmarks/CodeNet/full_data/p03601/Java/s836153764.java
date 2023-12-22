import java.util.*;

public class Main
{

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        int F = sc.nextInt();
        double density = 0.0;
        int sum_w = 0; int sum_s = 0;
        for (int a = 0; a < 35; a++) {
            for (int b = 0; b < 35; b++) {
                for (int t1 = 0; t1 < 3005; t1++) {
                    int t = 100*a*A + 100*b*B + t1;
                    if (t == 0) continue;
                    if (t1 <= E*(a*A+b*B) && t <= F){
                        if (density < (t1 + 0.0) / t){
                            for (int c = 0; c*C <= t1; c++) {
                                if ((t1 - c * C) % D == 0) {
                                    density = (t1 + 0.0) / t;
                                    sum_w = 100 * a * A + 100 * b * B;
                                    sum_s = t1;
                                    break;
                                }
                            }
                        }

                    }
                }
            }
        }
        System.out.println((sum_w + sum_s) + " " + sum_s);
    }
}
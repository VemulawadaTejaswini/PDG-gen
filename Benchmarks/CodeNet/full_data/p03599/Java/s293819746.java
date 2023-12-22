import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());
        int D = Integer.parseInt(sc.next());
        int E = Integer.parseInt(sc.next());
        int F = Integer.parseInt(sc.next());

        double density = 0;
        int ans_1 = 0;
        int ans_2 = 0;
        for (int x_a=0;100*A*x_a<=F*100/(100+E);x_a++) {
            for (int x_b=0;100*B*x_b<=F*100/(100+E)-100*A*x_a;x_b++) {
                // int x_b = (F*100/(100+E)-100*A*x_a)/(100*B);
                int water = 100*A*x_a+100*B*x_b;
                for (int x_c=0;C*x_c<=Math.min(F-water, water*E/100);x_c++) {
                    for (int x_d=0;D*x_d<=Math.min(F-water, water*E/100)-C*x_c;x_d++) {
                        // int x_d = (Math.min(F-water, water*E/100)-C*x_c)/D;
                        int sugar = C*x_c+D*x_d;
                        if (density<=(double)sugar/(double)water) {
                            ans_1 = sugar+water;
                            ans_2 = sugar;
                            density = (double)sugar/(double)water;
                        }
                    }
                }
            }
        }
        System.out.println(ans_1 + " " + ans_2);
    }
}
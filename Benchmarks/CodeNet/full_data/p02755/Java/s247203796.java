import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int Aval, Bval;

        // int loop = (int) Math.min(A / 0.08, B / 0.1);
        // System.out.println(loop);
        for (int i = 1; i <= 1000; i++) {
            Aval = (int) (i * 0.08);
            Bval = (int) (i * 0.1);
            //System.out.println(Aval+" "+Bval);
            if (A == Aval && B == Bval) {
                // System.out.println("i*0.08 = "+(int)(i * 0.08)+"i*0.1 = "+(int)(i * 0.1));
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println(-1);
        sc.close();
    }
}
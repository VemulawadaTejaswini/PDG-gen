import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int loop = (int) Math.min(A / 0.08, B / 0.1);
        // System.out.println(loop);
        for (int i = loop; i <= 1000; i++) {
            //System.out.println("i*0.08 = " + (int) (i * 0.08) + "i*0.1 = " + (int) (i * 0.1));
            if ((int) (i * 0.08) == (int) (i * 0.1)) {
                // System.out.println("i*0.08 = "+(int)(i * 0.08)+"i*0.1 = "+(int)(i * 0.1));
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println(-1);
        sc.close();
    }
}
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m  = sc.nextInt();
        int d = sc.nextInt();

        if (d == 0) {
            System.out.println((double) (m- 1) / (double) n);
        } else {
            System.out.println((double) 2 * (n - d) * (m - 1)/ (double) Math.pow(n, 2));
        }


        System.out.println();
    }

}

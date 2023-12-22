import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int max = (int) java.lang.Math.ceil(N / 2.0);
        if (K <= max) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
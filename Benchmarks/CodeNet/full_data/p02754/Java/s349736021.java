import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int N, A, B;
        int r = 0, q = 0;
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();

        q = N / (A + B);

        r = N - (A + B) * q;

        if (r <= A){
            System.out.println(A*q + r);
        }else if (r > A){
            System.out.println(A*q + A);
        }

    }

}

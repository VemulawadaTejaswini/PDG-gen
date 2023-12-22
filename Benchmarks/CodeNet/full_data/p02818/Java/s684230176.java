import java.util.Scanner;

public class Cookie {

    public static void main(String[] args) {
        int A;
        int B;
        int K;
        Scanner sc= new Scanner(System.in);

        A=sc.nextInt();
        B=sc.nextInt();
        K=sc.nextInt();

        while(K>0) {
            if (A > 0) {
                A--;
            } else {
                if (B > 0)
                    B--;
            }
            K--;
        }
        System.out.println(A);
        System.out.println(B);

    }
}

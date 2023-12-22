import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int X = 0;
        for (int i=0; i<2; i++) {
            if (A > B) {
                X += A;
                A--;
            } else {
                X += B;
                B--;
            }
        }
        System.out.println(X);
    }
}

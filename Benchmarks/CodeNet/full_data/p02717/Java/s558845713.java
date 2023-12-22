import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();

        int A = Y;
        int B = X;
        int C = A;
        A = Z;

        System.out.println(A + " " + B + " " + C);
    }
}

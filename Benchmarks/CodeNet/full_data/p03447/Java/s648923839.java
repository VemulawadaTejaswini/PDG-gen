import java.util.*;
public class Main {
    public static void main(String[] args) {
        int X, A,B;
        Scanner sc = new Scanner(System.in);
        X = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        X = X -A;
        System.out.println(X%B);
    }

}

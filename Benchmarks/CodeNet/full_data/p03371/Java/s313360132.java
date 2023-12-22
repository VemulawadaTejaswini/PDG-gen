import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int AB = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int sum = 0;
        if (AB * 2 < A + B) {
            if (AB < A) {
                sum += (AB * 2) * X;
            } else {
                sum += A * (Math.abs(X - Y));
            }
            if (AB < B) {
                sum += (AB * 2) * Y;
            } else {
                sum += B * (Math.abs(X - Y));
            }
        } else {
            sum += (A * X) + (B * Y);
        }
        System.out.println(sum);
    }
}

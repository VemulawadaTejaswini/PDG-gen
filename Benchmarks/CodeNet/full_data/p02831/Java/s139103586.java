import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int res = lcm(A, B);
        System.out.println(res);
    }
    public static int gcd(int a, int b) {
        if(b==0) {
            return a;
        } else {
            int t = a%b;
            return gcd(b, t);
        }
    }

    public static int lcm(int a, int b) {
        int g = gcd(a,b);
        return a / g * b;
    }
}

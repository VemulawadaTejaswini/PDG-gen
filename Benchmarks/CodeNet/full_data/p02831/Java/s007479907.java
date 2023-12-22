import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        System.out.println(lcm(m,n));
    }
    
    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static int lcm (int a, int b) {return a*b/gcd(a,b);}

}
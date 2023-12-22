import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.println(C % getGCD(A,B) == 0 ? "YES" : "NO");
    }
    static private int getGCD(int a , int b){
        while( a % b != 0 ){
            if (a > b) {
                a = a - b;
            }else {
                b = b - a;
            }
        }
        return Math.min(a, b);
    }
}

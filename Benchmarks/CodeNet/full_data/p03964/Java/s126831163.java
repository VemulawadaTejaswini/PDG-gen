import java.util.*;

public class Main
{

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n = sc.nextInt();
        int ma = 1;
        int mb = 1;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = gcd(a, b);
            a /= c;
            b /= c;

            int addB = (b - (mb % b)) % b;
            int addB_A = (addB + mb) / b * a - ma;

            int addA = (a - (ma % a)) % a;
            int addA_B = (addA + ma) / a * b - mb;

            if (addA_B < 0){
                mb += addB;
                ma += addB_A;
            } else if (addB_A < 0){
                mb += addA_B;
                ma += addA;
            } else if (addA_B + addA < addB_A + addB){
                mb += addA_B;
                ma += addA;
            } else {
                mb += addB;
                ma += addB_A;
            }
//            System.out.println(ma);
//            System.out.println(mb);
        }

        System.out.println(ma + mb);
    }
    public static int gcd(int a, int b){
        while (a != b){
            if (a == 0){
                return b;
            }
            if (b ==0){
                return a;
            }
            if (a > b){
                return gcd(a %b, b);
            } else {
                return gcd(b % a, a);
            }
        }
        return a;
    }
}
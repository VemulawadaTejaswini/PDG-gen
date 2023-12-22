import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long mod = 1000000007;
        long res = 1;
        int[] p = new int[3];
        Arrays.fill(p, -1);
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int c = 0;
            for(int j=0; j<3; j++) {
                if (p[j] + 1 == a) {
                    c++;
                }
            }
            if(c == 1) {
                //
            } else if (c==2) {
                res *= 2;
            } else if (c==3) {
                res *= 3;
            } else {
                System.out.println(0);
                return;
            }
            res %= mod;
            for(int j=0; j<3; j++) {
                if (p[j] + 1 == a) {
                    p[j]++;
                    break;
                }
            }

        }
        System.out.println(res);
    }

}



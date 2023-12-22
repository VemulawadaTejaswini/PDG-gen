import java.util.*;

public class Main {

    private static int mod = 1000000007;
    private static int[][] c;

    public static void main(String[] args){

        prepare();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = n - k;

        for(int i=1; i<=k; i++) {

            if(l+1<i) {
                System.out.println(0);
                continue;
            }

            long a = c[l+1][i];

            int rem = k - i;
            if(rem > 0) {
                a *= c[rem+i-1][i-1];
                a %= mod;
            }

            System.out.println(a);


        }

    }

    private static void prepare() {
        c = new int[2002][2002];
            c[0][0] = 1;
        for(int i=1; i<2002; i++) {
            c[i][0] = 1;
            for(int j=1; j<=i; j++) {
                c[i][j] = (c[i-1][j] + c[i-1][j-1]) % mod;
            }
        }

    }

}

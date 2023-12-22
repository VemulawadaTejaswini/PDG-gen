import java.util.*;

public class Main {
    public static int[] fact;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean tog = false;
        int prev = 0;

        int a;
        int secInd = 0;
        Set appeared = new HashSet();

        for (int i=0; i<n+1; i++) {
            a = sc.nextInt();
            if ( appeared.contains(a) ) {
                secInd = i;
            } else {
                appeared.add(a);
            }
            if ( a == prev ) {
                tog = true;
                break;
            }
            prev = a;
        }

        fact = new int[n+2];
        //store factorials
        fact[0] = 1;
        for (int i=1; i<=n+1; i++) {
            fact[i] = fact[i-1] * i;
        }

        int ans;
        for (int i=1; i<=n+1; i++) {
            ans = comb(n+1, i);
            if (secInd != 0 && i<=n+1-secInd) {
                ans -= comb(n-secInd, i-1);
            }
            System.out.println(ans);
        }
    }

    public static int comb(int n, int k) {
        return fact[n] / (fact[k]*fact[n-k]);
    }
}

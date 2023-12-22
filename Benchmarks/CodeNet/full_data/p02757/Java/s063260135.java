import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        char[] c = sc.next().toCharArray();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = c[n-1-i]-'0';
        }

        long res = 0;
        if(p == 2 || p == 5) {
            for(int i=0; i<n; i++) {
                if(a[i] % p == 0) {
                    res += n - i;
                }
            }
            System.out.println(res);
            return;
        }

        int[] s = new int[n];
        s[0] = a[0] % p;
        int base = 1;
        int[] rem = new int[p];
        rem[0] = 1;
        rem[s[0]] ++;
        for(int i=1; i<n; i++) {
            base *= 10;
            base %= p;
            s[i] = (s[i-1] + base * a[i]) % p;
            rem[s[i]]++;
        }
        for(int i=0; i<p; i++) {
            long r = rem[i];
            res += r * (r-1) / 2;
        }
        System.out.println(res);
    }

}



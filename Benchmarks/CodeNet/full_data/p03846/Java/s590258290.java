import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int[] count = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(sc.next());
            count[a[i]]++;
        }
        
        long ans = 0;
        if(n % 2 == 0) {
            for(int i=1; i<=n; i+=2) {
                if(count[i] == 2) {
                    ans++;
                }else {
                    ans = 0;
                    break;
                }
            }
        }else {
            if(count[0] == 1) {
                for(int i=0; i<=n; i+=2) {
                    if(count[i] == 2) {
                        ans++;
                    }else {
                        ans = 0;
                        break;
                    }
                }
            }
        }
        if(ans == 0) {
            System.out.println(0);
        }else {
            long z = 1;
            while(ans > 0) {
                z *= 2;
                ans--;
                z = z % 1000000007;
            }
            System.out.println(z);
        }

        
    }
}

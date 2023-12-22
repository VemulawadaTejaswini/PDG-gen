import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {
    static int gcd(int x, int y) {
        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }
        List<Integer> cand = new ArrayList();
        int ans = 1;
        for (int i = 1; i < Math.sqrt(x); i++) {
            if (x % i == 0) {
                cand.add(i);
                cand.add(x/i);
            }
        }
        Collections.sort(cand);
        for (int i = cand.size()-1; i > 0; i--) {
            if (y % cand.get(i) == 0) {
                ans = cand.get(i);
                break;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] sa = br.readLine().split(" ");
        int[] a = new int[sa.length];
        
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(sa[i]);
        }
        
        int[] l = new int[n];
        int[] r = new int[n];
        
        l[0] = a[0];
        for (int i = 1; i < n; i++) {
            l[i] = gcd(l[i-1], a[i]);
        }
        
        r[0] = a[n-1];
        for (int i = 1; i < n; i++) {
            r[i] = gcd(r[i-1], a[n-1-i]);
        }
        
        int max = 1;
        for (int i = 0; i < n; i++) {
            int num;
            if (i == 0) {
                num = r[n-2];
            }
            else num = gcd(l[i-1], r[n-1-i]);
            if (num > max) max = num;
        }
        
        System.out.println(max);
    }
}




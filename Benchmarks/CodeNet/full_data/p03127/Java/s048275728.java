import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {
    static int gcd(int x, int y) {
        int r = Math.max(x, y) % Math.min(x, y);
        if (r == 0) return Math.min(x, y);
        else return gcd(Math.min(x, y), r);
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String[] nabc = br.readLine().split(" ");
        int n = Integer.parseInt(br.readLine());
        String[] m = br.readLine().split(" ");
        int[] mon = new int[n];
        
        for (int i = 0; i < n; i++) {
            mon[i] = Integer.parseInt(m[i]);
        }
        
        int cd = gcd(mon[0], mon[1]);
        for (int i = 2; i < n; i++) {
            cd = gcd(cd, mon[i]);
            if (cd == 1) {
                break;
            }
        }
        
        System.out.println(cd);
    }
}




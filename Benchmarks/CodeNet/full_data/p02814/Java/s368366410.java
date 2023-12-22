import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> a = new HashSet<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt()/2);
        }
        int g = 1;
        boolean odd = false;
        boolean even = false;
        for(int x : a){
            g = lcm(g, x);
            if(x % 2 == 0) even = true;
            else odd = true;
        }
        if(odd && even) System.out.println(0);
        int ans = (m - g) / (g*2);
        if(g <= m) ans++;
        System.out.println(ans);
        sc.close();

    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static int gcd(int a, int b) {
        if (a < b)
            return gcd(b, a);
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }


}

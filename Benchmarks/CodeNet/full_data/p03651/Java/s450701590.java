import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int a1 = sc.nextInt();
        if (n == 1) {
            System.out.println(a1 == k ? "POSSIBLE" : "IMPOSSIBLE"); return;
        }

        int a2 = sc.nextInt();
        if (a1 == k || a2 == k) {
            System.out.println("POSSIBLE"); return;
        }

        boolean greaterNumExists = false;
        if (a1 > k || a2 > k) {
            greaterNumExists = true;
        }

        int gcd = GCD(a1, a2);
        int tmp;
        for (int i=2; i<n; i++) {
            tmp = sc.nextInt();
            if (tmp == k) { System.out.println("POSSIBLE"); return; }
            if (!greaterNumExists && tmp > k) { greaterNumExists = true; }
            if (tmp % gcd != 0) { gcd = GCD(gcd, tmp); }
        }
        if (!greaterNumExists) { System.out.println("IMPOSSIBLE"); return; }
        System.out.println(k % gcd == 0 ? "POSSIBLE" : "IMPOSSIBLE");
    }

    public static int GCD(int x, int y) {   
        int r;
        while (y!=0) {
            r = x%y; x = y; y = r;
        }
        return x;
    }
}
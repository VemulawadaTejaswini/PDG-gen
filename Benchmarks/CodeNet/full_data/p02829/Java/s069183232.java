import java.util.*;

public class Main {
    static int MOD = 1000000007;
	static int INF = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = 0;
        if (a == 1 && b == 2) res = 3;
        if (a == 1 && b == 3) res = 2;
        if (a == 2 && b == 1) res = 3;
        if (a == 2 && b == 3) res = 1;
        if (a == 3 && b == 1) res = 2;
        if (a == 3 && b == 2) res = 1;
                
        System.out.println(res);
    }
}
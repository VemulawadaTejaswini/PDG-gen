import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long total = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    total += getGCD(i, j , k);
                }
            }
        }
        System.out.println(total);
    }
    
    static int getGCD(int x, int y, int z) {
        return getGCD(x, getGCD(y, z));
    }
    
    static int getGCD(int x, int y) {
        if (x % y == 0) {
            return y;
        } else {
            return getGCD(y, x % y);
        }
    }
}
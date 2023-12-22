import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        while(true){
            int k = f(n);
            boolean b = true;
            for (int i = 1; i <= k; i++){
                long a = (n / h(i)) % 10;
                if (a < 9 && (n - h(i)*(a+1) >= 0)){
                    n -= h(i)*(a+1);
                    b = false;
                }
            }
            if(b) {
                break;
            }
        }
        System.out.println(g(n));
    }
    private static int f(long k){
        int count = 1;
        while(k/10 != 0){
            k /= 10;
            count++;
        }
        return count;
    }

    private static int g(long n) {
        int ret = 0;
        for (int i = 1; i <= f(n); i++){
            ret += (n / h(i)) % 10;
        }
        return ret;
    }

    private static long h(int a){
        long ret = 1;
        for (int i = 1; i < a; i++){
            ret *= 10;
        }
        return ret;
    }
}
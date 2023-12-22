import java.util.*;
public class Main {
    static final long MODVAL = 998244353L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long result = 0L;
        while(X>0) {
            if(X >= 500) {
                X-=500;
                result+=1000;
                continue;
            }
            if(X >= 5) {
                X-=5;
                result+=5;
                continue;
            }
            break;
        }
        System.out.println(result);
    }
}

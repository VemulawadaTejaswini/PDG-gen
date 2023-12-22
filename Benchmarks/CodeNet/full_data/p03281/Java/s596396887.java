import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0;
        for(int i = 1; i <= n; i++) {
            ans += check(i);
        }
        System.out.println(ans);
    }

    public static int check(int num) {
        int cnt = 0;
        for(int i = 1; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                cnt += num / i == i ? 1 : 2;
            }
        }
        
        return num %2 == 1 && cnt == 8 ? 1 : 0;
    }
}

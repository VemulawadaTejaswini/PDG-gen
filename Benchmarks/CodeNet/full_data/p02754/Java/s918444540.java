import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        
        int n = sn.nextInt();
        int a = sn.nextInt();
        int b = sn.nextInt();
        int add = a + b;
        
        int ans = 0;
        
        ans = a * (n / add);
        
        if((n % add) <= a) {
            ans += n % add;
        } else {
            ans += a;
        }
        
        System.out.print(ans);
    }
}

import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        int o1 = 0;
        int o2 = 0;
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() == 1) {
                o1 = i;
                o2 = i;
            }
        }
        
        int min = 0;
        int max = n - 1;
        while (o1 < max) {
            o1 += k - 1;
            ans++;
        }
        while (min < o2) {
            o2 -= k - 1;
            ans++;
        }
        System.out.println(ans);
    }    
}

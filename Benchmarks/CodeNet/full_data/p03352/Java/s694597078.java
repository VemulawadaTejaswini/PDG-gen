import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = 0;

        for (int i = x; i > 0; i--) {
            if (x / i == i && x % i == 0) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);

        sc.close();
    }    
}

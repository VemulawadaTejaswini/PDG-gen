import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        
        while (n-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            count += b;
            
            if (count >= k) {
                System.out.println(a);
                return;
            }
        }
    }
}

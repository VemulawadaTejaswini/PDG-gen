import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int x = b[i];
            for (int j = i + 1; j < n; j++) {
                int y = b[j];
                ans += x * y;
            }
        }

        System.out.println(ans);

        sc.close();
    }    
}

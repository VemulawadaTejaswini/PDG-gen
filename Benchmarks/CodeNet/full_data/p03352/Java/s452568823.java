import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = 0;

        for (int i = 1; i < x; i++) {
            if (Math.pow(i,2) <= x) {
                ans = (int) Math.pow(i,2);
            }
        }
        System.out.println(ans);

        sc.close();
    }    
}

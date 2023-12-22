import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for(int i = 1; i <= n; i++){
            String s = String.valueOf(i);
            ans += s.length()%2 != 0 ? 1 : 0;
        }
        System.out.println(ans);
    }
}

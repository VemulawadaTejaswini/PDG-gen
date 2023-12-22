import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        long x = 149696127901L;
        long ans = (x / 11) * 2;
        x = x % 11;
        if(x > 0 && x <= 6) ans++;
        else if(x > 6) ans += 2;
        
        System.out.println(ans);
    }
}

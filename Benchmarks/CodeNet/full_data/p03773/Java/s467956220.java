import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());

        int ans;
        
        if(N+W>24)          ans = Math.abs(24-(N+W));
        else if(N+W==24)    ans = 0; 
        else                ans = N+W
        
        
        System.out.println(ans);
    }

}
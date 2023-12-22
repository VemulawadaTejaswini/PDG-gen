import java.util.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long t = Long.parseLong(sc.next());
        long start = 0l;
        long now = 0l;
        long ans = 0l;
        for(int i=0;i<n;i++){
            long tw = Long.parseLong(sc.next());
            if(now+t<tw){
                ans += now+t-start;
                start = tw;
            }
            now = tw;
        }
        ans += now+t-start;
        System.out.println(ans);
    }
}
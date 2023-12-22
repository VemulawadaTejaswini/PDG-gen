import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        ArrayList<Integer> nzlist = new ArrayList<Integer>();
        int ans = 0;
        for(int i=0;i<n;i++){
            int s = Integer.parseInt(sc.next());
            if(s%10!=0) nzlist.add(s);
            ans += s;
        }
        if(ans%10==0){
            if(nzlist.isEmpty()) ans = 0;
            else {
                nzlist.sort((a,b)->a-b);
                ans -= nzlist.get(0);
            }
        }
        System.out.println(ans);
    }
}

import java.util.*;
import static java.lang.Math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int max_l = 0;
        int min_r = Integer.MAX_VALUE;

        for(int i = 0; i<m; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();

            max_l = max(l,max_l);
            min_r = min(r,min_r);
            
        }
        int ans = min_r - max_l;
        if(ans < 0) ans = 0;
        System.out.println(ans+1);
    }
}
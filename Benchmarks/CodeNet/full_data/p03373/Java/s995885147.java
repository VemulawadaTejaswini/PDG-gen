import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt(), b = sc.nextInt(), c =sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
        long ans = x*a + y*b;
        
        ans = Math.min(ans ,Math.max(x,y)*2*c);
        
        if(y-x>=1)
        ans = Math.min(ans, x*2*c + (y - x)*b);
        if(x-y >=1)
        ans = Math.min(ans, y*2*c + (x - y)*a);
            
        System.out.println(ans);
    }
}

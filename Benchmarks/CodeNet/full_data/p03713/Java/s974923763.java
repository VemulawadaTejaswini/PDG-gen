import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        long ans=Long.MAX_VALUE;
        long a,b,c;
        a=h/3*w;
        b=(h-h/3)*(w/2);
        c=(h-h/3)*(w-w/2);
        ans=Math.min(ans,ans(a,b,c));
        a=(h/3+1)*w;
        b=(h-h/3-1)*(w/2);
        c=(h-h/3-1)*(w-w/2);
        ans=Math.min(ans,ans(a,b,c));
        
        a=h/3*w;
        b=(h-h/3)/2*w;
        c=(h-h/3-(h-h/3)/2)*w;
        ans=Math.min(ans,ans(a,b,c));
        
        a=w/3*h;
        b=(w-w/3)*(h/2);
        c=(w-w/3)*(h-h/2);
        ans=Math.min(ans,ans(a,b,c));
        a=(w/3+1)*h;
        b=(w-w/3-1)*(h/2);
        c=(w-w/3-1)*(h-h/2);
        ans=Math.min(ans,ans(a,b,c));
        
        a=w/3*h;
        b=(w-w/3)/2*h;
        c=(w-w/3-(w-w/3)/2)*h;
        ans=Math.min(ans,ans(a,b,c));
        
        System.out.println(ans);
    }
    public static long ans(long a,long b,long c){
        long max,min;
        max=Math.max(a,Math.max(b,c));
        min=Math.min(a,Math.min(b,c));
        return max-min;
    }
}

import java.util.*;
import java.util.stream.*;

class Main {
    static Scanner s=new Scanner(System.in);
    public static void main(String[]$){
        int n=s.nextInt(),t=s.nextInt();
        
        int r=1000000000;
        for(int i=0;i<n;++i){
            int a=s.nextInt(),b=s.nextInt();
            if(b<=t)
                r=Math.min(r,a);
        }
        System.out.println(r<1000000000?r:"TLE");
    }
}
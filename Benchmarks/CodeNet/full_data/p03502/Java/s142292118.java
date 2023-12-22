import java.util.*;
import java.lang.*;
 
 //O(100000000)
public class Main {
    public static void main(String[] args) {
 
        Scanner sc  = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        long a,s,d,f,g,h,j,k,l;
        
        a = N / 10 ;
        s = N / 100 ;
        d = N / 1000 ;
        f = N / 10000 ;
        g = N / 100000 ;
        h = N / 1000000 ;
        j = N / 10000000 ;
        k = N / 100000000 ;
       // l = N / 1000000000 ;
        
        long v = a+s+d+f+g+h+j+k;
        
        if(N%v==0)System.out.print("Yes");
        else  System.out.print("No");
        
        //System.out.print();
        System.out.println();
    }
 
}
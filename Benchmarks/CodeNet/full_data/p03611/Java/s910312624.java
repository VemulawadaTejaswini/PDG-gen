import java.util.*;
import java.lang.*;
 
 //O(100000000)
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        long N = Long.parseLong(sc.next());

        long[] a  = new long[(int)N];
        long[] b  = new long[(int)N];
        long[] c  = new long[(int)N];
        for(int i=0;i<N;i++){
            a[i] = Long.parseLong(sc.next());
            b[i] = a[i] + 1;
            c[i] = a[i] - 1;
        }
        
        int max=0;
        int now=0;
        
        for(int i=0;i<1000000;i++){
            now = 0;
            for(int j=0;j<N;j++){
                
                if(a[j] == i)  now++;
                if(b[j] == i)  now++;
                if(c[j] == i)  now++;
                
            }
            
            max = Math.max( max, now);
        }
        
     
        System.out.print( max);
        System.out.println();
    }

}
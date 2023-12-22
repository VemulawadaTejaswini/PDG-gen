import java.util.*;
import java.lang.*;
 
 //O(100000000)
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        long N = Long.parseLong(sc.next());

        long[] a  = new long[(int)N];
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<N;i++){
            a[i] = Long.parseLong(sc.next());
             hs.add((int)a[i]);
        }
        
        int max=0;
        int now=0;
        
        
       
          for (int f : hs) {
            
            int s = f;
            now= 0;
            for(int j=0;j<N;j++){
                
                if(a[j] == s)  now++;
                else if(a[j]-1 == s)  now++;
                else if(a[j]+1 == s)  now++;
                
            }
            
            max = Math.max( max, now);
        }
        
     
        System.out.print( max);
        System.out.println();
    }

}
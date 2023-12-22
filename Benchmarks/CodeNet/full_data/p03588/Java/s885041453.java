import java.util.*;
import java.lang.*;
 
 //O(100000000)
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int cnt = 0;

        long N = Long.parseLong(sc.next());
        long[] dp  = new long[(int)N];
        
        long A; 
        long B;
        long C=0;
        long D=100000001;
        
        for(int i=0;i<N;i++){
         A = Long.parseLong(sc.next());
         B = Long.parseLong(sc.next());
         C = Math.max(C,A);
         D = Math.min(D,B);
          
        }
        

        System.out.print(C+D);
        System.out.println();
    }

}
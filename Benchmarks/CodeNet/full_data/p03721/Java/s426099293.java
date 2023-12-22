 import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        long N = Long.parseLong(sc.next());
        long K = Long.parseLong(sc.next());
        
        long a = 0;
        long cnt = 0;

        for(long i=0;i<N;i++){
            a     = Long.parseLong(sc.next());
            cnt  += Long.parseLong(sc.next());
            
            if(cnt >= K) {
                System.out.print(c);
                break;   
            }
            
        }


        System.out.println();
    }

}
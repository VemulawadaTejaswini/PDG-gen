 import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        long N = Long.parseLong(sc.next());
        long W = Long.parseLong(sc.next());
        
        long c;
        long cnt = 0;


      
        for(int i=0;i<N;i++){
            c = Long.parseLong(sc.next());
            cnt  += Long.parseLong(sc.next());
            
            if(cnt >= W) {
               //System.out.print(cnt);
                System.out.print(c);
                break;   
            }
            
        }


        System.out.println();
    }

}
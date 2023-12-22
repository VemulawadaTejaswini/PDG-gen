import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        long N = Long.parseLong(sc.next());
        long W = Long.parseLong(sc.next());
        
        int c;
        long cnt = 0;


      
        for(int i=0;i<N;i++){
            c = Integer.parseLong(sc.next());
            cnt  += Integer.parseLong(sc.next());
            
            if(cnt >= W) {
               //System.out.print(cnt);
                System.out.print(c);
                break;   
            }
            
        }


        System.out.println();
    }

}
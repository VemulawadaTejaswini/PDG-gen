import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

     
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());

        int sum = 0;
        int flag = 0;
       
        for(int i=0;i<100;i++){
            sum += A;
            
            if(sum%B==C)flag++;
            
        }
            
        if(flag > 0) System.out.print("YES");
        else System.out.print("NO");
            

        System.out.println();
    }

}
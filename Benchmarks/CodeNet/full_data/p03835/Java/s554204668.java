import java.util.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int K = Integer.parseInt(sc.next());
        int S = Integer.parseInt(sc.next());
        
        int count = 0;
        
        if( K*3 < S )   count = 0;
        else if(S/K==3) count +=1;
        else if(S/K==2) count +=3;
        else if(S/K==1) count +=6;


        System.out.print(count);
        System.out.println();
    }

}
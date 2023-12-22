import java.util.*;
import java.lang.*;
 
 //O(100000000)
public class Main {
    public static void main(String[] args) {
 
        Scanner sc  = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        String S = String.valueOf(N);
        char[] c = S.toCharArray();
        
        long n = 0 ;
        
        for(int i=0; i < S.length(); i++){
              String str = String.valueOf(c[i]);
            n +=  Integer.parseInt(str);
        }

        if(N%n==0)System.out.print("Yes");
        else  System.out.print("No");
        
       //  System.out.print(n);
        
        //System.out.print();
        System.out.println();
    }
    
    public static final int length(long value) {
    int cnt = 0;
    do {
        cnt++;
        value /= 10;
    } while (value != 0);
    return cnt;
}
 
}
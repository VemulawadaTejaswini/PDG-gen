import java.util.*;

public class Main{

    static boolean isPrimeNum( int x ) {
        if( x == 2 ) return true;
        if( x < 2 || x % 2 == 0 ) return false;
        for( int n = 3; n <= Math.sqrt((double)x); n += 2 )
            if( x % n == 0 ) return false;
        return true;
    }

    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);

        int n;
        n = Integer.parseInt(scan.next());
        int i,k;
        i = 0;
        k = 3;
        
        while(i < n){
            if(isPrimeNum(k) && k % 10 != 1 && k % 10 != 3){
                System.out.print(k + " ");
                i++;
            }
            k++;
        }
    }
}
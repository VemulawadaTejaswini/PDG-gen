import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  W = sc.nextInt();
        int  a = sc.nextInt();
        int  b = sc.nextInt();
        int  d = 0; 
        
        if( ( a + W ) < b ){
            d = b - ( a + W );
            System.out.println(d);
        }else if ( ( a + W ) == b ){
            System.out.println(0);
        }else if ( ( b + W ) < a ){
            System.out.println( a - ( b + W ) );
        }else if ( ( b + W ) == a ){
            System.out.println(0);
        }else if ( b > a && ( a + W ) > b ){
            System.out.println(0);
        }else if ( a == b ){
            System.out.println(0);
        }
    }
    
}
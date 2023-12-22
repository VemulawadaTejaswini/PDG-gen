import java . io . BufferedReader ;
import java . io . IOException ;
import java . io . InputStreamReader ;
import java . util . LinkedList ;
import java . util . List ;
import java . util . Stack ;
 
public class Main {   
    public static void main ( String [] args ) throws IOException {     
        InputStreamReader isr = new InputStreamReader ( System . In );  
        BufferedReader br = new BufferedReader ( isr );  
 
        final String [] split_str = br . readLine (). split ( "" ); 
        final int n_num = Integer . parseInt ( split_str [ 0 ]);  
        final long k_num = Long . parseLong ( split_str [ 1 ]);  
 
        long [] bit_counter = new long [ 40 ];  
        final String [] num_array_str = br . readLine (). split ( "" ); 
 
        List < Long > num_list = new LinkedList <> ();  
 
        Stack < Boolean > binary_stack = new Stack <> ();  
 
        for ( String num_str : num_array_str ) {  
            long num = Long . parseLong ( num_str ); 
            num_list . add ( num );
 
            while ( num ! = 0 ) {   
                if ( num % 2 == 0 ) {     
                    binary_stack . push ( false );
                } else {  
                    binary_stack . push ( true );
                }
                num / = 2 ; 
            }
 
            int index = 0 ; 
 
            for ( boolean binary : binary_stack ) {  
                if ( binary ) {  
                    bit_counter [ index ] + = 1 ;  
                }
                index + = 1 ; 
            }
 
            binary_stack . clear ();
        }
 
        int binary_len = check_binary_len ( k_num );
 
        StringBuilder binary_str = new StringBuilder ();  
 
        for ( int i = binary_len - 1 ; 0 <= i ; i -) {     
            StringBuilder clone_build = new StringBuilder ();  
            clone_build . append ( binary_str . toString ());
            clone_build . append ( "1" );
 
            boolean allow_one = false ; 
 
            for ( int j = i - 1 ; 0 <= j ; j -) {     
                clone_build . append ( "0" );
            }
 
            if ( Long . parseLong ( clone_build . toString (), 2 ) <= k_num ) {    
                allow_one = true ; 
            }
 
            if ( n_num / 2 > = bit_counter [ i ] && allow_one ) {     
                binary_str . append ( "1" );
            } else {  
                binary_str . append ( "0" );
            }
        }
 
        long x_num = 0 ; 
 
        if (! binary_str . toString (). equals ( "" )) {  
            x_num = Long . parseLong ( binary_str . toString (), 2 );  
        }
 
        long ans = 0 ; 
 
        for ( long num : num_list ) {  
            ans + = num ^ x_num ;
        }
 
        System . Out . Println ( ans );
 
        br . close ();
        isr . close ();
    }
 
    private static int check_binary_len ( long num ) {   
        int len_num = 0 ; 
        while ( num ! = 0 ) {   
            num / = 2 ; 
            len_num ++;
        }
        return len_num ;
    }
}
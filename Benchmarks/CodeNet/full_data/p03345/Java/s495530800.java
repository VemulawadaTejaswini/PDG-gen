import java.util.*;
class Main{
    public static void main(String[] args){
        
        long limit  = (long)(Math.pow(10 , 18)) ;
        Scanner s = new Scanner(System.in) ;
        long a = s.nextLong() , b = s.nextLong() , c = s.nextLong()  , k = s.nextLong() ;
        
        if(k > 0){
        
            long diff = (b - a) ;
            long ab = (long)(Math.abs(diff));
//             System.out.println(limit+" li mit ") ;
            long pop = ab * diff;
            if(pop > limit){
                
                int[] p = new int[9];
                p[-1] = 0;
            }
//             else{
//                 System.out.println("Unfair");
//             }
            else
                System.out.println(diff*k) ;
        }
        else{
            
            long diff = (a - b);
            System.out.println(diff);
        }
        
        
        
        
    }
    
}
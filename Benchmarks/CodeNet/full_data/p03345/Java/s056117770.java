import java.util.*;
class Main{
    public static void main(String[] args){
        
        long limit  = (long)(Math.pow(10 , 9)) ;
        Scanner s = new Scanner(System.in) ;
        long a = s.nextLong() , b = s.nextLong() , c = s.nextLong()  , k = s.nextLong() ;
        
        if(k > 0){
        
            long diff = (b - a) ;
            long ab = (long)(Math.abs(diff));
            
//             if(ab >= limit && k >= limit){
//                 System.out.println("Unfair");
//             }
//             else
                System.out.println(diff*k) ;
        }
        else{
            
            long diff = (a - b);
            System.out.println(diff);
        }
        
        
        
        
    }
    
}
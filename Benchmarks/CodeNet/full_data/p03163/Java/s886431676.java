
import static java.lang.Math.abs;
import static java.lang.System.exit;
import java.math.BigInteger;
import java.util.*;
import java.util.LinkedList;

public class Main {


    
    static Long result;
    static Long[][] posibilities;
    public static  Long NS (int[] w,int[] v,int max, int n){
        //System.out.println("n"+ n);
        // System.out.println("max"+ max);
        if(n>0){
        if (posibilities[n][max] != null){
            return posibilities[n][max];
        }
        }
        if (n< 0 || max==0){
            return Long.valueOf(0);
        }
        
        if (w[n] > max){
            result= Long.valueOf( NS(w,v,max,n-1));
        }
        
        else{
           
           Long yes= Long.valueOf( v[n]+ NS(w,v,max-w[n],n-1));
           Long no= Long.valueOf( NS(w,v,max,n-1));
           
           result= Math.max(yes,no);
           posibilities[n][max]= result;
        }
        
        return result;
    }
    
   
    
    
   
    public static void main(String args[]) {
         
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int max= scan.nextInt();
        
        int [] weigths = new int[n];
        
        int [] values = new int[n];
        
        for (int i=0; i<n; i++){
           weigths[i]= scan.nextInt();
           values[i]= scan.nextInt();
           
        }
        
        posibilities= new Long[n][max+1];
        NS(weigths,values,max,n-1);
        System.out.print(result);
        
      
         
                  
        
        
    
    }

}

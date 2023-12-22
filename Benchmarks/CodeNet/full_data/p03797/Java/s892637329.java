import java.util.*;


public class Main{   
    
    public static void main(String[] args){            
       
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();        
        int M = sc.nextInt();                
        
        int count = N;
        
        int l = M - 2*N;
        
        int r = l/4;
        
        System.out.println(count + r);                                                                                        
        
    }                                       
}
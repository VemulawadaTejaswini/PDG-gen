import java.util.*;

public class Main {    
    public static void main(String[] args){        
        Scanner sc = new Scanner(System.in);                
        
        long W = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        
        long k = Math.abs(b-a);
        
        if(b > a + W){
            System.out.println(b - (a + W));
            return;
        }else if(a <= b && b <= a + W || a <= b + W && b+W <= a + W){
            System.out.println(0);            
            return;
        }else if(b + W < a){
            System.out.println(Math.abs(a - (b + W)));
            return;
        }
                
    }            
}

        
        
import java.util.*;

public class Main {    
    public static void main(String[] args){        
        Scanner sc = new Scanner(System.in);                
                
        long N = sc.nextLong();
        
        long power = 1;
        
        int MOD = (int) Math.pow(10,9) + 7;
        
        for(int i = 1;i <= N;i++){
            power = (power*i)%MOD;
        }        
        
        System.out.println(power);
        
        
    }            
}
        
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt(); 
        
        if (num == 1){
            
            System.out.println(1);
        
            
        } else{
            
            if (num % 2 == 1 ){
                
                System.out.println(0.6);    
            } else{
                System.out.println(0.5);
            }
        }
        
    }
}
import java.util.*;

public class Main {    
    
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);       
      
        long x = sc.nextLong();        
        
        if(x > 11){
            int count = (int)x/11;            
            int mod   = (int)x%11;            
            int plus = 0;            
            if(0 < mod && mod <= 5){
                plus++;
            }else if(mod > 5 && mod < 11){
                plus +=2;
            }
            
            System.out.println(count*2 + plus);
        }else if(x <= 5){            
            System.out.println(1);
        }else{
            System.out.println(2);
        }
        
    }      
}
        
       
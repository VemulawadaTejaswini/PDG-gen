import java.util.*;

public class Main {    
    
  public static void main(String[] args) {              
     Scanner sc = new Scanner(System.in);                
     
     long x = sc.nextLong();
     
     long a = x/11;          
     
     long count = a*2;
     
     if(x%11 > 0 && x%11 <= 6){
        count++;     
     }else if(x%11 >= 7 && x%11 <=9){
        count += 2;
     }
     
     System.out.println(count);          
     
  }          
}
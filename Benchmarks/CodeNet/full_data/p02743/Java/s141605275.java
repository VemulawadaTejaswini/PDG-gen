import java.util.*;
import java.math.*;
         
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            if(Math.sqrt((double)a) + Math.sqrt((double)b) < Math.sqrt((double)c)){
                System.out.println("Yes");
            } 
            else System.out.println("No");

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}
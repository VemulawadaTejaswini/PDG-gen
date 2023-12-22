import java.util.*;
import java.math.*;
         
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            String str = sc.next();
            str3 = str.substring(2, 3);
            str4 = str.substring(3, 4);

            str5 = str.substring(4, 5);
            str6 = str.substring(5, 6);

            if(str3.equals(str4) && str4.equals(str5))System.out.println("Yes");
            else System.out.println("No");
            
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}
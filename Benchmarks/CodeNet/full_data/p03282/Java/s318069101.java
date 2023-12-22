import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            String s = sc.next();
            long k = Long.parseLong(sc.next());

            for(int i = 0; i < s.length(); i++){
                String subS = s.substring(i, i + 1);
                if(!subS.equals("1")){
                    System.out.println(subS);
                    break;
                }
            }
 
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}
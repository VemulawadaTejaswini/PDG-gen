import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            long x = sc.nextLong();

            if(x < 7) System.out.println(1);
            else if(x < 11) System.out.println(2);
            else if(x % 11 == 0) System.out.println((x/11)*2);
            else System.out.println((((x - (x % 11))/11)*2) + 1);

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}
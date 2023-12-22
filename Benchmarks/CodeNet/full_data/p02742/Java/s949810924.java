import java.util.*;
import java.math.*;
         
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            Long height = sc.nextLong();
            Long width = sc.nextLong();

            BigInteger ans = new BigInteger("0");

            if(height % 2 == 0 || width % 2 == 0){
                ans = height * width / 2;
            }else{
                ans = (height * width + 1) / 2;
            }

            System.out.println(ans);
 
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}
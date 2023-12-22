import java.util.*;
import java.math.*;
         
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            BigDecimal height = new BigDecimal(sc.next());
            BigDecimal width = new BigDecimal(sc.next());

            BigDecimal ans = new BigDecimal("0");
            BigDecimal two = new BigDecimal("2");
            BigDecimal zero = new BigDecimal("0");
            BigDecimal one = new BigDecimal("1");


            if(height.remainder(two).equals(zero) || width.remainder(two).equals(zero)){
                ans = height.multiply(width).divide(two);
            }else{
                ans = (height.multiply(width).add(one)).divide(two);
            }

            System.out.println(ans);
 
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}
import java.util.*;
import java.math.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        BigDecimal a = new BigDecimal(input);
        BigDecimal b = new BigDecimal(0);
        BigDecimal answer = new BigDecimal(0);
        BigDecimal two = new BigDecimal(2);
      
      
      if(input==1){
        answer = a.divide(a);
      }else{
        b = a.divide(two,0, BigDecimal.ROUND_UP);
        answer = b.divide(a,10, BigDecimal.ROUND_DOWN);
      }
        System.out.println(answer);
    }
}
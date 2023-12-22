import java.math.*;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
    	BigDecimal pi=new BigDecimal("3.14159265359");
    	Scanner sc = new Scanner(System.in);
    	BigDecimal m = sc.nextBigDecimal();
    	System.out.println(m.multiply(pi).multiply(new BigDecimal(2)));
    	
    }
}
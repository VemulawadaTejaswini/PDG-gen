import java.util.*; 
import java.math.BigDecimal;
import java.math.MathContext;

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        BigDecimal a= sqrt(new BigDecimal(sc.nextDouble()),50);
    BigDecimal b= sqrt(new BigDecimal(sc.nextDouble()),50);
    BigDecimal c= sqrt(new BigDecimal(sc.nextDouble()),50);
    
  		BigDecimal d=a.add(b);
  		
  		int f=d.compareTo(c);
    
 	if(f==-1){
    		System.out.println("Yes");
    	}else{
     		System.out.println("No");
   	 }

    	
    }
   public static BigDecimal sqrt(BigDecimal a, int scale){
        //とりあえずdoubleのsqrtを求める
        BigDecimal x = new BigDecimal(
                Math.sqrt(a.doubleValue()), MathContext.DECIMAL64);
        if(scale < 17) return x;

        BigDecimal b2 = new BigDecimal(2);
        for(int tempScale = 16; tempScale < scale; tempScale *= 2){
            //x = x - (x * x - a) / (2 * x);
            x = x.subtract(
                    x.multiply(x).subtract(a).divide(
                    x.multiply(b2), scale, BigDecimal.ROUND_HALF_EVEN));
        }
        return x;
    }


}
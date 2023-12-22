import java.util.*; 
import java.math.BigDecimal;


class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        BigDecimal a=new BigDecimal(Math.sqrt(sc.nextDouble()));
       BigDecimal b=new BigDecimal(Math.sqrt(sc.nextDouble()));
   BigDecimal c=new BigDecimal(Math.sqrt(sc.nextDouble()));
  
  		BigDecimal d=a.add(b);
  		
  		int f=d.compareTo(c);
    
 	if(f==-1){
    		System.out.println("Yes");
    	}else{
     		System.out.println("No");
   	 }

    	
    }
}
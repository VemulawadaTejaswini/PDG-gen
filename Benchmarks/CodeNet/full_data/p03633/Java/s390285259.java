import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
	        long valueLCM = 0;
	        ArrayList<Long> list = new ArrayList<>();
	        int n = sc.nextInt();
	        
	        for(int i=0;i<n;i++) {
	        	list.add(sc.nextLong());
	        }
	        

	        for(int index=0; index<list.size()-1; index++) {
	            if( index==0 ) {
	                valueLCM = calcLCM( list.get(index), list.get(index+1) );
	            } else {
	                valueLCM = calcLCM( valueLCM,        list.get(index+1) );
	            }
	        }
	        System.out.println(valueLCM);
	    }

	    private static long calcLCM(long val1, long val2) {
	        long maxValue = Math.max(val1, val2);
	        long minValue = Math.min(val1, val2);
	        BigInteger val3 = BigInteger.valueOf(maxValue);
	        val3 = val3.multiply(BigInteger.valueOf(minValue));
	        
	        //long val3    = maxValue * minValue;

	        if(minValue==0) return maxValue;

	        long temp;
	        while( (temp=maxValue%minValue)!=0 ) {
	            maxValue=minValue;
	            minValue=temp;
	        }
	        val3 =val3.divide(BigInteger.valueOf(minValue));
	        long ret = val3.longValue();
	        
	        return ret;
	    }
		
		
	}
	

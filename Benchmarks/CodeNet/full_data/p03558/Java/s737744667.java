import java.util.*;
import java.math.BigInteger;

public class Main {// Main
	private static int f(BigInteger x){
		int tot = 0;
		for(int i = 0; i < x.toString().length(); i++)
			tot += x.toString().charAt(i)-'0';
		return tot;
	}
	
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        BigInteger x = new BigInteger(cin.nextLine());
        BigInteger b = new BigInteger("1");
        
        int res = 1234567;
        
        while(b.toString().length() <= 45){
        	if(x.compareTo(b) != -1){
            	BigInteger y = x.add(b).add(new BigInteger("-1")).divide(b);
        		res = Math.min(res, f(y));
        	}
        	
        	x.multiply(new BigInteger("10"));
        }
        
        System.out.print(res);
        cin.close();
    }
}
import java.util.*;
import java.math.BigInteger; 

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		BigInteger a = new BigInteger("2");
		
		a = a.pow(n-1);
	
		int p = sc.nextInt();
		if(p == 1){
		    a = a.subtract(new BigInteger("1"));
		}
		System.out.println(a);
	}
}

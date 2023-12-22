
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double n=sc.nextLong();
		if(n<=6&&n>0) System.out.println("1");
		else
		{
		long ans=(long)Math.ceil(2*n/(double)11);
		System.out.println(ans);	
		}
	}
	
}

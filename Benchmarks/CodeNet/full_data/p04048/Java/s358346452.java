//package AtCoder;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long x=sc.nextLong();
		long ans=(x*2)/(n-2*x)-1;
		ans=ans+n+2*x;
		
		System.out.println(ans);
	}

}

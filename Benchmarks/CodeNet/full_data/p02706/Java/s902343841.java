import java.math.BigInteger;
import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=0;i<n;i++) {
			int t=sc.nextInt();
			n-=t;
		}
		if(n>=0)System.out.println(n);
		else System.out.println(-1);
	}
}

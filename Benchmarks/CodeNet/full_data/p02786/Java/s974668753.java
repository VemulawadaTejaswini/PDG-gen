import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong()/2;
		long c=1;
		long i=1;
		while(n>0) {
			c+=2*i;
			n=n/2;
			i++;
		}
		System.out.println(c);
	}
}
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		long ans=0;
		long i=1;
		while(n>0) {
			n/=2;
			ans+=i;
			i*=2;
		}System.out.println(ans);
	}
}
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		System.out.println(k%2==1 ? (n/k)*(n/k)*(n/k) : ((n/(k/2))-n/k)*((n/(k/2))-n/k)*((n/(k/2))-n/k)+(n/k)*(n/k)*(n/k));
	}
}
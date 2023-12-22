import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		long n = Long.parseLong(sc.next());
		long m = Long.parseLong(sc.next());
		if(n > 1){
			n = factorial(n) / factorial(n - 2) / factorial(2);	//nC2
		}else{
			n = 0;
		}
		if(m > 1){
			m = factorial(m) / factorial(m - 2) / factorial(2);	//mC2
		}else{
			m = 0;
		}
		System.out.println(n + m);
	}
	
	//階乗
	public static long factorial(long n){
		return n == 0 ? 1 : n * factorial(n-1);
	}
}

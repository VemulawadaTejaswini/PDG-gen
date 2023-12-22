import java.util.*;
public class Main {
	static long func(long n, long x){
		if(n==-1){
			return 0;
		}else{
			return n/x + 1L;
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();

		System.out.println(func(b,x)-func(a-1,x));
	}
}
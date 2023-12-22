import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		System.out.println(max(n));
	}

	static long max(long n) {
		if(n<10)
			return n;
		
		String s="";
		while(Long.parseLong(s+"9")<=n)
			s+="9";
		int i=1;
		long ans=Long.parseLong(s);
		for(i=1;i<10 && Long.parseLong(i+s)<=n;i++){
			ans = Long.parseLong(i+s);
		}
		int sum=0;
		while(ans>0){
			sum+=ans%10;
			ans/=10;
		}
		return sum;
	}
}
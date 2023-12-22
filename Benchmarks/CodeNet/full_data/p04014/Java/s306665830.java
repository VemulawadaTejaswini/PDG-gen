import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		long s = Long.parseLong(br.readLine());
		
		long b = 2;
		while(true){
			long res = func(b,n);
			if(res == s){
				System.out.println(b);
				return;
			}
			if(res == 1){
				System.out.println(-1);
				return;
			}
//			System.out.println("f(" + b + "," + n + ") = " + res);
			
			b++;
		}
		
	}
	
	public static long func(long b,long n){
		if(n < b){
			return n;
		}else{
			return func(b,n/b) + n%b;
		}
	}
}

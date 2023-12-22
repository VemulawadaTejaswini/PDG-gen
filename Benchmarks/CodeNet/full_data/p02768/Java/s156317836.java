import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		long num = 1000000007;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
//	 		String input1 = bf.readLine().trim();
//	 		String input2 = bf.readLine().trim();
	 		StringTokenizer st = new StringTokenizer(bf.readLine());
	 		
	 		long n = Long.parseLong(st.nextToken());
	 		long a = Long.parseLong(st.nextToken());
	 		long b = Long.parseLong(st.nextToken());
 		long ans = power((long)(2), n, num);
 		long nca = 1;
 		for(long k = n;k>n-a;k--){
 			nca = nca*k;
 			nca = nca%num;
 		}
 		for(long k = 1;k<=a;k++){
 			nca = nca*power(k, num-2, num);
 			nca = nca%num;
 		}
 		
 		long ncb = 1;
 		for(long k = n;k>n-b;k--){
 			ncb = ncb*k;
 			ncb = ncb%num;
 		}
 		for(long k = 1;k<=b;k++){
 			ncb = ncb*power(k, num-2, num);
 			ncb = ncb%num;
 		}
 		
 		ans = ans-nca;
 		ans = (ans%num+num)%num;
 		ans = ans-ncb;
 		ans = (ans%num+num)%num;
	 	out.println(Math.max(0, ans-1));
 		out.close();
 		
 		
 		
 	}
	public static int power(long x, long y, long mod){
		long ans = 1;
		while(y>0){
			if (y%2==1)
				ans = (ans*x)%mod;
			x = (x*x)%mod;
			y/=2;
		}
		return (int)(ans);
	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	



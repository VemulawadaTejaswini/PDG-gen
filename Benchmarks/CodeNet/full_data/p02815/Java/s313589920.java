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
	 	int n = Integer.parseInt(bf.readLine());
	 	ArrayList<Integer> array = new ArrayList<Integer>();
	 	StringTokenizer st2 = new StringTokenizer(bf.readLine());
	 	for(int j=0;j<n;j++){
	 		array.add(Integer.parseInt(st2.nextToken()));
	 	}
	 	Collections.sort(array);
	 	long prod = power(2, 2*n-2, num);
	 	long sum = 0;
	 	for(int i = n-1;i>=0;i--){
	 		sum+=(long)((n+1-i))*(long)(array.get(i));
	 		sum%= num;
	 	}

 		
 		
 		out.println((sum*prod)%num);
	 		
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

 		
 		
 		
 		
	



import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		StringTokenizer st = new StringTokenizer(bf.readLine());
 		int n = Integer.parseInt(st.nextToken());
 		int m = Integer.parseInt(st.nextToken());
 		StringTokenizer st1 = new StringTokenizer(bf.readLine());
 		int[] array = new int[n];
 		
 		array[0] = Integer.parseInt(st1.nextToken());
 		long currlcm = array[0]/2;
 		int ans = 0;
 		int temp = v2(array[0]/2);
 		for(int i = 1;i<n;i++){
//	 		String input1 = bf.readLine().trim();
//	 		String input2 = bf.readLine().trim();
	 		array[i] = Integer.parseInt(st1.nextToken());
	 		if (v2(array[i]/2) != temp){
	 			out.println(0);
	 			out.close();
	 		}
	 		currlcm = currlcm*(array[i]/2)/gcd(currlcm, array[i]/2);
	 		if (currlcm > m){
	 			out.println(0);
	 			out.close();
	 		}
 		}
 		
 		
 		
 		out.println((m/currlcm+1)/2);
	 		
 		out.close();
 		
 		
 		
 	}
	public static long gcd(long a, long b){ 
	      if (b == 0) 
	        return a; 
	      return gcd(b, a % b);  
	    }
	public static int v2(int n){
		int count = 0;
		int temp = n+0;
		while(temp%2 == 0){
			temp/=2;
			count++;
		}
		return count;
	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	



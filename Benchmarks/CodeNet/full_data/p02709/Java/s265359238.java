import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		int n = Integer.parseInt(bf.readLine());
 		StringTokenizer st = new StringTokenizer(bf.readLine());
 		long[] array = new long[n+1];
 		
 		ArrayList<Pair5> pairs = new ArrayList<Pair5>();
 		pairs.add(new Pair5(0, 0));
 		for(int i = 0;i<n;i++){
 			array[i+1] = Long.parseLong(st.nextToken());
 			pairs.add(new Pair5(array[i+1], i+1));
 		}
 		Collections.sort(pairs);
 		long[][] dp = new long[n+1][n+1];
 		for(int i = 1;i<=n;i++){
 			dp[i][i] = (long)(Math.abs(i - pairs.get(1).getIndex())) * pairs.get(1).getNumber();
 		}
 		for(int len = 1;len<n;len++){
 			for(int start = 1;start+len <=n;start++){
 				dp[start][start+len] = Math.max(dp[start+1][start+len] + (long)(Math.abs(pairs.get(len+1).getIndex() - start)) * pairs.get(len+1).getNumber(), dp[start][start+len-1] + (long)(Math.abs(pairs.get(len+1).getIndex() - (start+len))) * pairs.get(len+1).getNumber());
 			}
 		}
 		
 		out.println(dp[1][n]);
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
class Pair5 implements Comparable<Pair5> {
	private long number;
	private int index;
	public Pair5(long number, int index){
		this.number = number;
		this.index = index;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int compareTo(Pair5 other){
		if (number > other.number){
			return 1;
		}
		else if (other.number > number){
			return -1;
		}
		else{
			return index - other.index;
		}
	}
}
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	



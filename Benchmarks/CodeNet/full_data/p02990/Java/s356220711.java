import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] dataStr = br.readLine().split(" ");
		int n = Integer.parseInt(dataStr[0]);
		int k = Integer.parseInt(dataStr[1]);
		
		for(int i=1; i<=k; i++)
			System.out.println((int)((combination(k-1, (i-1)) * combination(n-k-1,i))%(Math.pow(10, 9)+7)));
	}
	
	private static long combination(long n, long r){
		long result = 1;
		int i;
		for(i=0; i<r; i++)
			result *= n-i;
		for(i=2; i<=r; i++)
			result /= i;
		return result;
	}
}

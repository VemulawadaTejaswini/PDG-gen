import java.io.*;
import java.math.BigInteger;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] line = br.readLine().split(" ");
		int[] monsters = new int[n+1];
		int i;
		for(i=0; i<=n; i++)
			monsters[i] = Integer.parseInt(line[i]);
		line = br.readLine().split(" ");
		int[] braves = new int[n];
		for(i=0; i<n; i++)
			braves[i] = Integer.parseInt(line[i]);
		
		BigInteger count = BigInteger.ZERO;
		int tmp, killed;
		for(i=0; i<n; i++){
			tmp = braves[i];
			killed = Math.min(tmp, monsters[i]);
			monsters[i] -= killed;
			tmp -= killed;
			count = count.add(new BigInteger(Integer.toString(killed)));
			killed = Math.min(tmp, monsters[i+1]);
			tmp -= killed;
			monsters[i+1] -= killed;
			count = count.add(new BigInteger(Integer.toString(killed)));
		}
		System.out.println(count);
	}
}

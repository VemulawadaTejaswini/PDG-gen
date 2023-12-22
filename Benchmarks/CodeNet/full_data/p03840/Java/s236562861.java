import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int[] fig = new int[7];
		int rta = 0;
		int pnd = 0;
		for (int i = 0; i < fig.length; i++) {
			fig[i] = Integer.parseInt(stk.nextToken());
		}
		rta += (fig[0]/2)*4;
		pnd+= fig[0]%2;
		rta += fig[1]*2;
		rta += (fig[3]/2)*3;
		pnd+= fig[3]%2;
		rta += (fig[4]/2)*3;
		pnd+= fig[4]%2;
		
		if(pnd == 3)
			rta+=6;
		System.out.println(rta/2);
	}
}

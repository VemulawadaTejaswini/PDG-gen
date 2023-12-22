import java.io.*;
import java.util.Arrays;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(in.readLine());
		int c = 0;
		
		for (int i = 0; i < a.length; i++) {
			int min = -1;
			
			if(a[i] > 1){
				if(a[i] % 2 == 0){
					c+= a[i] / 2;
					a[i] = 0;
				}
				else{
					c += (a[i] - 1) / 2;
					a[i] = 1;
				}
			}
			if(i > 0){
				min = Math.min(a[i], a[i-1]);
				a[i] -= min;
				a[i-1] -= min;
				c += min;
			}
		}
		
		System.out.println(c);
	}
}

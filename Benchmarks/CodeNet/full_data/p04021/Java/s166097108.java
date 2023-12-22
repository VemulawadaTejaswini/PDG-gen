import java.io.*;
import java.util.Arrays;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		int[] a = new int[(n+1)/2];
		int[] b = new int[n/2];
		int k = 0;
		int h = 0;
		for (int i = 0; i < n; i++)
			if(i % 2 == 0) a[k++] = Integer.parseInt(in.readLine());
			else b[h++] = Integer.parseInt(in.readLine());
		
		int d = 0;
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		k = 0;
		h = 0;
		
		int[] c = new int[n];
		for (int i = 0; i < c.length; i++)
			if(i % 2 == 0)
				c[i] = a[k++];
			else
				c[i] = b[h++];
		
		for (int i = 0; i < c.length - 1; i++) {
			if(c[i] > c[i+1]){
				int temp = c[i];
				c[i] = c[i+1];
				c[i+1] = temp;
				d++;
			}
		}
		
		System.out.println(d);
	}
}

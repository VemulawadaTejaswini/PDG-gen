import java.io.*;
import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		int n = 0;
		
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			n = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			return;
		}
		
		int min = Integer.MAX_VALUE;
		for (int i = 1; i <= n / 2; i++) {
			int a = i;
			int b = n - i;
			
			int tmp = 0;
			while (a > 0) {
				tmp += (a % 10);
				a /= 10;
			}
			while (b > 0) {
				tmp += (b % 10);
				b /= 10;
			}
			
			min = Math.min(min, tmp);
		}
		
		System.out.println(min);
	}
}

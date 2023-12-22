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
		
		int n2 = n;
		int sn = 0;
		while (n2 > 0) {
			sn += (n2 % 10);
			n2 /= 10;
		}
		
		System.out.println((n % sn == 0) ? "Yes" : "No");
	}
}

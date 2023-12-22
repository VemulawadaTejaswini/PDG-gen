import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		int n = 0;
		int k = 0;
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] strs = br.readLine().split(" ");
			n = Integer.parseInt(strs[0]);
			k = Integer.parseInt(strs[1]);
			
			String str = br.readLine();
		} catch (IOException e) {
			return;
		}
		
		int cnt = n / k;
		if (n % k != 0) cnt++;
		
		int tmp = (n / k) - 1;
		while (tmp >= 1) cnt += tmp--;
		
		System.out.println(cnt);
	}
}

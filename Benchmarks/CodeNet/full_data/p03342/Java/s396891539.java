import java.io.*;

public class Main {
	public static void main(String[] args) {
		int n = 0;
		String str = null;
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			n = Integer.parseInt(br.readLine());
			str = br.readLine();
		} catch (IOException e) {
		}
		
		int[] as = new int[n];
		int nn = 0;
		for (String s : str.split(" ")) {
			as[nn++] = Integer.parseInt(s);
		}
		
		int cnt = n;
		for (int i = 0; i < as.length - 1; i++) {
			for (int j = i + 1; j < as.length; j++) {
				if ((as[i] ^ as[j]) == as[i] + as[j]) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}
}

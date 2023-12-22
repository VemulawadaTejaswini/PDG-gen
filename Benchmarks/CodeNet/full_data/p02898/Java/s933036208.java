import java.io.BufferedReader;
import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
		try {
			String nandk[] = br.readLine().split(" ");
			int n = Integer.parseInt(nandk[0]);
			int k = Integer.parseInt(nandk[1]);
			String[] h = br.readLine().split(" ");
			int count = 0;

			for(int i = 0; i < n; i++) {
				if(Integer.parseInt(h[i]) >= k) {
					count++;
				}
			}

			System.out.println(count);
			br.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}

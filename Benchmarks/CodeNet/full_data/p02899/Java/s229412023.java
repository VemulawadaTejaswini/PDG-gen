import java.io.BufferedReader;
import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			String[] a = br.readLine().split(" ");
			int[] order = new int[n];
			for(int i = 0; i < n; i++) {
				order[Integer.parseInt(a[i]) - 1] = i + 1;
			}
			for(int i = 0; i < n; i++) {
				if(i != 0) {
					System.out.print(" ");
				}
				System.out.print(order[i]);
			}
			br.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}

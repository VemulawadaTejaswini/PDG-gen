import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ", n);
		StringBuilder sb = new StringBuilder();
		boolean flag = (n % 2 == 0);
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				sb.append(arr[i]);
				flag = !flag;
				continue;
			}
			if (flag) {
				sb.append(" ").append(arr[i]);
			} else {
				sb.insert(0, " ").insert(0, arr[i]);
			}
			flag = !flag;
		}
		System.out.println(sb);
	}
}

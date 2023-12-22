import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer n = Integer.valueOf(br.readLine());
		int i;
		Integer[] d = new Integer[n];
		for(i=0;i<n;i++) d[i] = Integer.valueOf(br.readLine());
		Arrays.sort(d);
		int cnt = 0,temp = 101;
		for(i=n-1;i>=0;i--) {
			if(temp > d[i]) {
				temp = d[i];
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
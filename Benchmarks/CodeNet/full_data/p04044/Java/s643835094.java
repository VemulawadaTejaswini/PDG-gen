import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = br.readLine().split("\\s+");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		String[] str = new String[n];
		for(int i=0;i<n;i++)
			str[i] = br.readLine();
		
		Arrays.sort(str);
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++)
			sb.append(str[i]);
		System.out.println(sb);
	}
}

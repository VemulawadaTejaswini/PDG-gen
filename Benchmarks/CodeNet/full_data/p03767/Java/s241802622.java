import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {

	public static void main(String[] args)throws Exception {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (is);
		int num = Integer.parseInt(br.readLine());
		String []group = br.readLine().split(" ");
		Arrays.sort(group);
		int len = group.length-2;
		long result = 0;
		for(int i = 0;i<num;i++) {
			result += Integer.parseInt(group[len]);
			len -=2;
		}
		System.out.println(result);
	}

}

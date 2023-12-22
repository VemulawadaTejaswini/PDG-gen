
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		br.readLine();
		int count = 0;
		for(String s: br.readLine().split(" ")) {
			int kazu = Integer.parseInt(s);
			if(kazu%2 != 0) {
				count++;
			}
		}
		if(count%2 != 0) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}
	}
}
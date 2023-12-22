import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader buff = null;
		buff = new BufferedReader(new InputStreamReader(System.in));

		String line = buff.readLine();
		int count = 0;
		for(int i = 0; i < 3; ++i){
			if(line.charAt(i) == '1'){
				count++;
			}
		}
		System.out.println(count);
	}

	static long f() {
		long ans = 0;


		return ans;
	}
}
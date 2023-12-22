import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader buff = null;
		buff = new BufferedReader(new InputStreamReader(System.in));

		int A = Integer.parseInt(buff.readLine());
		int B = Integer.parseInt(buff.readLine());
		int C = Integer.parseInt(buff.readLine());
		int X = Integer.parseInt(buff.readLine());
		int count = 0;
		for(int i = 0; i <= A; ++i){
			for(int j = 0; j <= B; ++j){
				for(int k = 0; k <= C; ++k){
					int tmp = 500 * i + 100 * j + 50 * k;
					if(tmp == X){
						count++;
					}
				}
			}
		}

		System.out.println(count);
	}

	static long f() {
		long ans = 0;


		return ans;
	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader buff = null;
		buff = new BufferedReader(new InputStreamReader(System.in));

		String[] box = buff.readLine().split(" ");
		int N = Integer.parseInt(box[0]);
		int A = Integer.parseInt(box[1]);
		int B = Integer.parseInt(box[2]);

		int count = 0;
		while(N > 0){
			int total = 0;
			int pre = N;
			while(pre > 0){
				total += pre % 10;
				pre = pre / 10;
				//System.out.println(" / " + pre + " " + total);
			}
			if(total >= A && total <= B){
				//System.out.println(" * " + total + " " + N);
				count += N;
			}
			N--;
		}

		System.out.println(count);
	}

	static long f() {
		long ans = 0;


		return ans;
	}
}
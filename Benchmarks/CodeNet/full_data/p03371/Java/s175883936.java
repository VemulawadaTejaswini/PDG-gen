import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader buff = null;
		buff = new BufferedReader(new InputStreamReader(System.in));


		int A = 0, B = 0, C = 0;
		int X = 0, Y = 0;
		String[] box = buff.readLine().split(" ");
		A = Integer.parseInt(box[0]);
		B = Integer.parseInt(box[1]);
		C = Integer.parseInt(box[2]);
		X = Integer.parseInt(box[3]);
		Y = Integer.parseInt(box[4]);
		int ans = 0;

		double pre_X = X, pre_Y = Y;
		while((pre_X > 0) || (pre_Y > 0)){
			if(pre_X >= 0.5 && pre_Y >= 0.5){
				int half = (A/2) + (B/2);
				if(half < C){
					ans += half;
				} else {
					ans += C;
				}
				pre_X -= 0.5;
				pre_Y -= 0.5;
			} else if(pre_X >= 1){
				ans += A;
				pre_X--;
			} else if(pre_Y >= 1){
				ans += B;
				pre_Y--;
			}
		}

		int over = 0;
		if(X > Y){
			over = X * 2 * C;
		} else {
			over = Y * 2 * C;
		}
		if(ans > over){
			ans = over;
		}

		int usu = X * A + Y * B;
		if(ans > usu){
			ans = usu;
		}

		System.out.println(ans);
	}

	static long f() {
		long ans = 0;


		return ans;
	}
}
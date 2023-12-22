import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader buff = null;
		buff = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(buff.readLine());
		boolean flag = true;
		int x = 0, y = 0;
		while(N-- > 0){
			String[] box = buff.readLine().split(" ");
			int t = Integer.parseInt(box[0]);
			int x_tmp = Integer.parseInt(box[1]);
			int y_tmp = Integer.parseInt(box[2]);

			int abs_x = Math.abs(x - x_tmp);
			int abs_y = Math.abs(y - y_tmp);

			//System.out.println("x : " + x + " y : " + y + " t : " + t + " x_tmp : " + x_tmp + " y_tmp : " + y_tmp + " abs_x : " + abs_x + "abs_y : " + abs_y);
			boolean stay_flag = (abs_x + abs_y % 2 == 0) ^ (t % 2 == 0);
			if(t == abs_x + abs_y){
				x = x_tmp;
				y = y_tmp;
			} else if(t > abs_x + abs_y && stay_flag){
				x = x_tmp;
				y = y_tmp;
			} else {
				flag = false;
			}
		}

		if(flag){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	static long f() {
		long ans = 0;

		return ans;
	}
}
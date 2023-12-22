
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] n    = br.readLine().toCharArray();
		char[] tmp  = br.readLine().toCharArray();

		for(int i = 0; i < n.length; i++) {

			int now = i;
			boolean flg = true;
			for(int j = 0; j < n.length; j ++) {

				if(now >=  n.length) {
					now = 0;
				}
				if(tmp[now] != n[j]) {
					flg  = false;
					break;
				}

				now++;
			}

			if(flg) {

				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");

	}
}

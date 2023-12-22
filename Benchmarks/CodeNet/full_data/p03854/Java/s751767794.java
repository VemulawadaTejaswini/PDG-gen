import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader buff = null;
		buff = new BufferedReader(new InputStreamReader(System.in));

		String S_tmp = buff.readLine();
		String[] divide_tmp = {"dream", "erase", "eraser" ,"dreamer"};

		String S = "";
		String[] divide = {"", "", "",""};

		for(int i = S_tmp.length() - 1; i >= 0; --i){
			S += S_tmp.charAt(i);
		}
		//System.out.println(S);

		for(int i = 0; i < 4; ++i){
			for(int j = divide_tmp[i].length() - 1; j >= 0; --j){
				divide[i] += divide_tmp[i].charAt(j);
			}
			//System.out.println(divide[i]);
		}
		//System.out.println();

		boolean can = true;
		for(int i = 0; i < S.length();){
			boolean can2 = false;
			for(int j = 0; j < 4; ++j){
				String d = divide[j];
				int max = d.length() + i >= S.length() ? S.length() : d.length() + i;
				if(S.substring(i, max).equals(d)){
					can2 = true;
					i += d.length();
				}
			}

			if(!can2){
				can = false;
				break;
			}
		}

		if(can){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	static long f() {
		long ans = 0;

		return ans;
	}
}
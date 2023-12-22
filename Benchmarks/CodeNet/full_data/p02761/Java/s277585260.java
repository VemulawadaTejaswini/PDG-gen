
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] as = br.readLine().split(" ");
		int n = Integer.parseInt(as[0]);
		int m = Integer.parseInt(as[1]);
		boolean absolute_flag = false;
		String[] result = new String[n];
		boolean[] flag = new boolean[n];
		for(int i = 0 ; i< n ;i++) {
			flag[i] = false;
			result[i] = "0";
		}
		
		for(int i = 0 ; i < m ; i++) {
			as = br.readLine().split(" ");
			int keta = Integer.parseInt(as[0])-1;
			int kazu = Integer.parseInt(as[1]);
			if(flag[keta] == true && Integer.parseInt(result[keta]) != Integer.parseInt(as[1])) {
				absolute_flag = true;
			}
			if(keta == 0 && kazu == 0) {
				absolute_flag = true;
			}
			flag[keta] = true;
			result[keta] = String.valueOf(kazu);
			
		}
		int resultt = 0;
		for(int i = 0 ; i< n ; i++) {
			if(flag[i] == false) {
				result[i] = "0";
			}
			resultt = 10*resultt + Integer.parseInt(result[i]);
		}
		if(absolute_flag) {
			resultt = -1;
		}
		
		System.out.println(resultt);
		
		
	}

}

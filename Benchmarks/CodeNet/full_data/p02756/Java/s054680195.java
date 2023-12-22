
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n ; i++) {
			String[] as = br.readLine().split(" ");
			if(Integer.parseInt(as[0]) == 1) {
				StringBuffer sb = new StringBuffer(s);
				s = sb.reverse().toString();
			}else {
				if(Integer.parseInt(as[1]) == 1) {
					s = as[2] + s;
				}else {
					s = s + as[2];
				}
			}
		}
		System.out.println(s);
	}

}

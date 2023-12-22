import static java.lang.Integer.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		String N = st.nextToken();
		int iN = parseInt(N);
		String[] out = {"0","1","2","4","6","8","9"};
		int count =0;

		label :for(int i=357;i<=iN;i+=2) {
			String si = String.valueOf(i);
			for(int k=0;k<out.length;k++) {
				if(si.contains(out[k])) {
					continue label;
				}
			}
			if(!(si.contains("7") && si.contains("5") && si.contains("3"))) {
				continue;
			}
			count ++;
		}
		System.out.println(count);


	}


}

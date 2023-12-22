
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		int count=0;
		int checkbin=0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s[] = new String[2*n];
		s = br.readLine().split("");

//		String right[] = new String[n];
//		String left[] = new String[n];

		ArrayList right = new ArrayList();
		ArrayList left = new ArrayList();

		for(int i=0;i<Math.pow(2, 2*n);i++) {
			checkbin=0;
			right.clear();
			left.clear();
			String bin = Integer.toBinaryString(i);
			String splitbin[] = bin.split("");


	        List list = Arrays.asList(splitbin);
	        Collections.reverse(list);
	        splitbin = (String[])list.toArray();

			int pattern[] = new int[2*n];
			for(int k=0;k<splitbin.length;k++) {
				pattern[k] = Integer.parseInt(splitbin[k]);
			}
			for(int binary: pattern) {
				checkbin +=binary;
			}
			if(checkbin != n) {
				continue;
			}

			for(int j=0;j<2*n;j++) {
				if(pattern[j]==0) {
					right.add(s[j]);
				}else {
					left.add(s[j]);
				}
			}

			Collections.reverse(right);


			if(right.toString().equals(left.toString())) {
				count++;
			}
		}

		System.out.println(count);

	}

}

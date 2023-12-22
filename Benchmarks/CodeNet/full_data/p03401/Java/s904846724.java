import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ

		  System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

			int n = Integer.parseInt(in.readLine());
			int now;
			int total;
			int a;
			ArrayList<Integer> ar1 = new ArrayList<Integer>();

			String str = in.readLine();
			String[] str1Ary = str.split(" ");

			for (int i = 0 ; i < n ; i++) {
				ar1.add(Integer.parseInt(str1Ary[i]));
			}

			for (int j = 0 ; j < n ; j++) {
				now = 0;
				total = 0;
				a = 0;
				for (int k = 0 ; k < n ; k++) {
					a = ar1.get(k);
					if ( k == j) {
						continue;
					}
					else {
						total += Math.abs(now - a);
						now = a;
					}
				}
				total += Math.abs(now - 0);
				System.out.println(total);
			}
	}
}

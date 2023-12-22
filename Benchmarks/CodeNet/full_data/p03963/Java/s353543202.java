import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line []=br.readLine().split(" ");
		int n=Integer.parseInt(line[0]);
		int k=Integer.parseInt(line[1]);

		int ans =k;
		for(int i=1;i<n;i++) {
			ans*=(k-1);
		}

		System.out.println(ans);
	}

}

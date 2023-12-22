import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] str = new String[n];
		str = br.readLine().split(" ");
		int[] num = new int[n];

		for(int i=0; i<n;i++) {
			num[i] =Integer.parseInt(str[i]);
		}

		int max = num[0];
		for(int i=0; i<n-1; i++) {
			if(num[i]<num[i+1]) max=num[i+1];
		}

		int min = num[0];
		for(int i=0; i<n-1; i++) {
			if(num[i]>num[i+1]) min=num[i+1];
		}

		System.out.println(max-min);
	}

}

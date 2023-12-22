import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		
		BufferedReader vf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(vf.readLine());
		int k = Integer.parseInt(vf.readLine());
		
		int ans=1;
		
		for(int i=0;i<n;i++) {
			if(ans<k)ans*=2;
			else ans+=k;
		}
		System.out.println(ans);
		
	}
	/*public int soN(int a) {
		return a*2;
	}
	
	public int soK(int a, int b) {
		return a+b;
	}*/

}

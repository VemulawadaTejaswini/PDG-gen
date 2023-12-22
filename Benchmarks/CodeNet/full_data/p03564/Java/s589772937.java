import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		
		BufferedReader vf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(vf.readLine());
		int k = Integer.parseInt(vf.readLine());
		
		int max=0;
		int temp=0;
		
		for(int i=0;i<n;i++) {
			temp=2*i+k*(n-i);
			if(temp<max)max=temp;
		}
		System.out.println(max);
		
	}
	/*public int soN(int a) {
		return a*2;
	}
	
	public int soK(int a, int b) {
		return a+b;
	}*/

}

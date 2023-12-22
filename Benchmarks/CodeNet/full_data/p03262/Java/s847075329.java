import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = br.readLine().split(" ");
		int n = Integer.parseInt(strs[0]);
		int  ref= Integer.parseInt(strs[1]);
		strs = br.readLine().split(" ");
		int[] px = new int[n];
		for(int i = 0 ; i < n ; i++){
			px[i] = Math.abs(Integer.parseInt(strs[i]) - ref);
		}
		int res = px[0];
		for(int i = 0 ; i < px.length ; i++){
			int a = (px[i] > res) ? px[i] : res;
			int b = (px[i] > res) ? res : px[i];
			while(a%b != 0){
				int buff = b;
				b = a%b;
				a = buff;
			}
			res = b;
		}
		
		System.out.println(res);
	}
}

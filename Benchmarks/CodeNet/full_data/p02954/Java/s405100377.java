import java.io.PrintWriter;
import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		//入力
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		//処理
		int n = s.length();
		int[] ans = new int[n];
		for(int i = 0; i < n; i++) ans[i] = 0;
		int last = 0;
		for(int i = 0; i < n; i++){
			if(s.charAt(i) == 'R'){
				last++;
			}else{
				ans[i] += last/2;
				ans[i-1] += (last+1)/2;
				last = 0;
			}
		}
		last = 0;
		for(int i = n-1; i >= 0; i--){
			if(s.charAt(i) == 'L'){
				last++;
			}else{
				ans[i] += last/2;
				ans[i+1] += (last+1)/2;
				last = 0;
			}
		}
		
		//出力
		PrintWriter out = new PrintWriter(System.out);
		for(int i = 0; i < n; i++){
			out.print(ans[i]);
			if(i != n-1) out.print(" ");
			else out.println();
		}
		out.flush();
	}
}
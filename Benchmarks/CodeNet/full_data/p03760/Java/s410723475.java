import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		//入力
		String o = sc.nextLine();
		String e = sc.nextLine();
		sc.close();

		//処理
		String ans = "";
		for(int i = 0; i < o.length(); i++){
			if(i == e.length()){
				ans += o.charAt(i);
			}else{
				ans += o.charAt(i);
				ans += e.charAt(i);
			}
		}

		//出力	
		out.println(ans);
		out.flush();
	}
}
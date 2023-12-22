import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * メモ
 * Scanner:nextは空白か改行までの単語
 * String[][] c = new String[h][w];
 * TemplateMain,"template_input.txt"
 * 0.5 == 1.0/2
 */

public class Main {
	
	public static void printlnYN(boolean b){
		if(b) System.out.println("Yes");
		else System.out.println("No");
	}

	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		int len = S.length();
		long ans = 0;
		
		for(int i = 0; i <= (1<<len-1)-1; i++){
			String ss = "";
			long sum = 0;
			ss += S.charAt(0);
			for(int j = (len - 1) - 1; j >= 0; j--){
				if((1&(i>>j)) == 1){
					sum += Long.valueOf(ss);
					//System.out.print(ss + "+");
					ss = "" + S.charAt(len-1-j);
				}else{
					ss += S.charAt(len-1-j);
				}
			}
			//System.out.println(ss);
			sum += Long.valueOf(ss);
			//System.out.println("=" + sum);
			ans += sum;
		}
		
		System.out.println(ans);
	}

}
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * メモ
 * Scanner:nextは空白か改行までの単語
 * String[][] c = new String[h][w];
 * TemplateMain,"template_input.txt"
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

    	int N = sc.nextInt();
    	String S = sc.next();

    	int max = 0;


    	for(int i = 1; i < N; i++){
    		String X = S.substring(0, i);
    		String Y = S.substring(i, S.length());

    		int m = 0;
    		for(int j = 0; j < 26; j++){
    			if(r(X, (char)('a'+j)) && r(Y, (char)('a'+j))) m++;
    		}
    		if(m > max) max = m;
    	}

    	System.out.println(max);

	}

	public static boolean r(String S, char c){
		boolean ans = false;
		for(int i = 0; i < S.length(); i++){
			if(S.charAt(i) == c){
				ans = true;
				break;
			}
		}
		return ans;
	}

}
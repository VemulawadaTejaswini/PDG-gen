import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// https://atcoder.jp/contests/abc145/tasks/abc145_b
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		sc.close();

		Character[] alphabet = new Character[26];
	    char c = 'A';
	    for (int i = 0; i < 26; i++){
	        alphabet[i] = c;
	        c++;
	    }

	    List<Character> list = Arrays.asList(alphabet);
	    for(int i=0;i<S.length();i++) {
	    	int index = (list.indexOf(S.charAt(i))+N)%26;
	    	System.out.print(alphabet[index]);
	    }


	}
}

//文字列
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int[] w = new int[26];

		boolean flag = false;

		for(int i=0;i<s.length();i++) {

			w[s.charAt(i)-97] ++;

		}

		for(int i=0;i<26;i++) {

			if(w[i]!=0 && w[i]%2!=0) {

				flag = true;

				break;
			}
		}

		if(flag) System.out.println("No");

		else System.out.println("Yes");
	}

}

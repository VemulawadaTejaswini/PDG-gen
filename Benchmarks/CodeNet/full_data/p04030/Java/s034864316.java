import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ary = sc.next().toCharArray();
		String str = "";
		for (char c : ary) {
			if(c == '0') str += "0";
			if(c == '1') str += "1";
			if(c == 'B' && !str.equals("")) {
				str = str.substring(0,str.length()-1);
			}
		}
		System.out.println(str);
	}
}
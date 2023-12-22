import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);


		String s = sc.next();
		char[] s_chars = s.toCharArray();
		String s_asc = new String(s_chars);

		String t = sc.next();
		char[] t_chars = t.toCharArray();
		String t_asc = new String(t_chars);
		String t_desc = new StringBuilder(t_asc).reverse().toString();


		if (s_asc.compareTo(t_desc) < 0){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String o = sc.next();
		String e = sc.next();
		for(int i = 0;i < o.length();i++) {
			System.out.print(o.charAt(i));
			if(i < e.length()) {
				System.out.print(e.charAt(i));
			}
		}
		System.out.println("");
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n;
		n = sc.next();
		
		sc.close();
		String r = "";
		int l = n.length();
		for(int i = 0; i < l; ++i) {
			r += n.charAt(l - i - 1);
		}
		
		if(n.equals(r))
		System.out.println("Yes");
		else System.out.println("No");
		
	}

}

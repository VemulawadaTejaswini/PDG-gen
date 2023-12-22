import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String t1 = scanner.next();
		String t2 = scanner.next();
		int m = t1.length()-1;
		boolean res = true;
		for (int i = 0; i <= m; i++) {
			if(t1.charAt(i)!=t2.charAt(m-i)){
				res = false;
			}
		}
		if(res) {
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
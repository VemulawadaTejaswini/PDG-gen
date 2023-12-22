import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String astr = String.valueOf(sc.next());
		String bstr = String.valueOf(sc.next());
		String cstr = String.valueOf(sc.next());
		String dstr = String.valueOf(sc.next());
		
		String res = astr + bstr + cstr + dstr;
		
		if(res.equals("1974")) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}
}

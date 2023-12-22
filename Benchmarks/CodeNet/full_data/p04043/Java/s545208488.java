//霊符「夢想封印」！！！！
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String a,b,c,abc;
		a = sc.next();
		b = sc.next();
		c = sc.next();
		abc = a+b+c;
		if(abc.equals("557")||abc.equals("575")||abc.equals("755")) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
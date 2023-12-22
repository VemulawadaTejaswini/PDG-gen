import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		int a=0,b=0,ans=0;
		a = c.indexOf('A');
		b = c.indexOf('Z');
		ans = b - a + 1;
		System.out.println(ans);
	}

}

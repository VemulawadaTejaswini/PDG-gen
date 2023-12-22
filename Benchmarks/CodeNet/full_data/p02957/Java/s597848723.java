import java.util.*;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 0;
		
		if(a % 2 == 0  && b % 2 == 1)
			out.println("IMPOSSIBLE");
		else if(a % 2 == 1 && b % 2 == 0)
			out.println("IMPOSSIBlE");
		else {
			ans = a + b / 2;
		}
		out.println(ans);
	}
}

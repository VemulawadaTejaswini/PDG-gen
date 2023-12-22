import java.util.*;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int x = sc.nextInt();
		int cnt = 0;
		int value = 0;
		for (int i = 0; i < n; i ++){
			if(value <= x)
				cnt++;
			value += sc.nextInt();
		}
		out.println(cnt);

	}
}
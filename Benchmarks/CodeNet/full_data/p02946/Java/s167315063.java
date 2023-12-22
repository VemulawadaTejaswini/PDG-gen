import java.util.*;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();
		int ans = 0;

			int start = x -  (k - 1);
			int num = k * 2 - 1;
		for(int i =0; i < num; i++)
			out.print(start + i + " ");			

	}
}
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());

		int l = 1;
		int r = n;

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 1; i <= m; i++) {
			int tl = Integer.parseInt(sc.next());
			int tr = Integer.parseInt(sc.next());

			if (l < tl) l = tl;
			if (tr < r) r = tr;
		}

		System.out.println(r - l + 1);

		sc.close();
	}
}
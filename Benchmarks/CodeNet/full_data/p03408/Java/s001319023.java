import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<String, Integer> m = new HashMap<>();

		int n = Integer.parseInt(sc.nextLine());

		for(int i = 0; i < n; i++)
		{
			String s = sc.nextLine();
			m.put(s, m.containsKey(s) ? m.get(s) + 1 : 1);
		}

		n = Integer.parseInt(sc.nextLine());

		for(int i = 0; i < n; i++)
		{
			String s = sc.nextLine();
			m.put(s, m.containsKey(s) ? m.get(s) - 1 : - 1);
		}

		int v = 0;
		for(Integer z : m.values())
		{
			v = Math.max(v, z);
		}
		System.out.println(v);
	}
}
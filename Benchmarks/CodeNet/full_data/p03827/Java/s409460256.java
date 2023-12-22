import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.next();
		String[] s = sc.next().split("");
		int x = 0, max = 0;
		for (int i = 0; i < s.length; i++)
			if (s[i].equals("I")) {
				x++;
				if (x > max)
					max = x;
			}
			else
				x--;
		System.out.println(max);
	}
}
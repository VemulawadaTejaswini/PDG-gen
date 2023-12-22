import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] o = sc.next().split("");
		String[] e = sc.next().split("");
		for (int i = 0; i < o.length + e.length; i++)
			if (i == 0 || i % 2 == 0)
				System.out.print(o[i / 2]);
			else
				System.out.print(e[i / 2]);
		System.out.println("");
	}
}
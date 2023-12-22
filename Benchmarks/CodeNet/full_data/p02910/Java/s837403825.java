import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String a;
		int count = 1;
		String flag = "Yes";
		Scanner sc = new Scanner(System.in);
		a = sc.next();
		String[] as = a.split("");
		for (String i : as) {
			if (count % 2 == 0 && i.equals("R")) {
				flag = "No";
			}
			if (count % 2 != 0 && i.equals("L")) {
				flag = "No";
			}
			count++;
		}

		sc.close();

		System.out.println(flag);

	}

}
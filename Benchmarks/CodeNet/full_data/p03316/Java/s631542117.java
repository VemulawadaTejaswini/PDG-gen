import java.util.Scanner;

public class Main {
	public static final void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		int sum =0;
		for (String s: line.split("")) {
			sum +=Integer.parseInt(s);
		}

		System.out.println(Integer.parseInt(line) % sum == 0 ? "Yes" : "No");
	}
}

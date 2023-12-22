import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		String[] texts = text.split("");
		int count = 0;
		for (String s : texts) {
			if(s.equals("1")) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
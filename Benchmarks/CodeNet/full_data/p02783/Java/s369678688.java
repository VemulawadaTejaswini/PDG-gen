import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int i = kb.nextInt();
		int j = kb.nextInt();
		int count = 0;
		while (i > 0) {
			count += 1;
			i = i - j;
		}
		kb.close();
		System.out.println(count);
	}

}

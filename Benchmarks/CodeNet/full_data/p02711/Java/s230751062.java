import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String x = input.nextLine();
		boolean lucky = false;
		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i)=='7') {
				lucky = true;
				break;
			}
		}
		System.out.println(lucky?"Yes":"No");
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String secc = sc.next();
      	char[] sec = secc.toCharArray();
		for(int i = 1; i < 4; i++) {
			if (sec[i-1] == sec[i]) {
				count++;
            }
		}
		if (count == 0) {
			System.out.println("Good");
		}
		else {
			System.out.println("Bad");
		}
	}
}
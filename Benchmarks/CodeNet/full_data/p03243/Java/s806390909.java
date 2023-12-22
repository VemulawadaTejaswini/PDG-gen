import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve(new Scanner(System.in));
	}

	public void solve(Scanner sc) {
		String n = sc.next();
		char first = n.charAt(0);
		char second = n.charAt(1);
		char third = n.charAt(2);
		
		if(first == second && second == third) {
			System.out.println(n);
			return;
		}
		
		StringBuilder answerBuilder = new StringBuilder();
		if(first < second) {
			int answerNum = Character.getNumericValue(first) + 1;
			answerBuilder.append(answerNum).append(answerNum).append(answerNum);
			System.out.println(answerBuilder.toString());
			return;
		} else if(first == second) {
			if(second < third) {
				int answerNum = Character.getNumericValue(first) + 1;
				answerBuilder.append(answerNum).append(answerNum).append(answerNum);
				System.out.println(answerBuilder.toString());
				return;
			} else {
				answerBuilder.append(first).append(first).append(first);
				System.out.println(answerBuilder.toString());
				return;
			}
		} else {
			answerBuilder.append(first).append(first).append(first);
			System.out.println(answerBuilder.toString());
			return;
		}
	}
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int one = 1;
		int three = 3;
		int nine = 9;
		int othree = 3;
		int onine = 9;
		int sum = a;
		int count = 0;
		while (sum > 0) {
			if (sum - nine > 0) {
				sum = sum - nine;
				nine = nine * onine;
				count++;
			} else if (sum - nine == 0) {
				count++;
				System.out.println(count);
				return;
			} else {
				break;
			}
		}
		while (sum > 0) {
			if (sum - three > 0) {
				sum = sum - three;
				three = three * othree;
				count++;
			} else if (sum - three == 0) {
				count++;
				System.out.println(count);
				return;
			} else {
				break;
			}
		}
		while (sum > 0) {
			if (sum > 0) {
				sum--;
				count++;
				if (sum == 0) {
					System.out.println(count);
					return;
				}
			}
		}

	}
}

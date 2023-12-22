
public class Main {
	public static void main(String[] args) {
		int seven = 0;
		int five = 0;
		int[] num = new int[3];
		for (int i = 0; i < 3; i++) {
			num[i] = new java.util.Scanner(System.in).nextInt();
		}
		for (int i = 0; i < 3; i++) {
			if (num[i] == 5) {
				five=five+1;
			}
			if (num[i] == 7) {
				seven=seven + 1;
			}

		}

		if (five == 2 && seven == 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
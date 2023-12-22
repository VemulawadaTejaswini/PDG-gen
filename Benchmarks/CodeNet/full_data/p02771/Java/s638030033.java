import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A[] = new int[10];
		boolean b = false;
		for (int i=0;i<3;i++) {
			int temp = sc.nextInt();
			A[temp]++;
			if (A[temp]==2) {
				b = true;
			}
			if (A[temp]==3) {
				System.out.println("No");
				return ;
			}
		}
		if (!b) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
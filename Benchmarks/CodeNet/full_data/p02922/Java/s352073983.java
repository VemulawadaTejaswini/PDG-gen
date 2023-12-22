import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int A,B;
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		Main main = new Main();
		main.Count(A, B);
	}

	private void Count(int A,int B) {
		if (B==1) {
			System.out.println(0);
			return;
		}
		if (B<=A) {
			System.out.println(1);
			return;
		}
		int now = A;
		for (int i=1;i<100;i++) {
			now +=A-1;
			if (now >=B) {
				System.out.println(i+1);
				return;
			}
		}
	}
}

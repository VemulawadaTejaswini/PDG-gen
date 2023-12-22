import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int count = 0;
		if(A == 5 || A == 7) {
			count++;
		}
		if(A == 7) {
			if(B == 5) {
				count++;
			}
		} else if(A == 5) {
			if(B == 5 || B == 7) {
				count++;
			}
		}
		if(A == 7 && B == 5) {
			if(C == 5) {
				count++;
			}
		} else if(A == 5 && B == 7) {
			if(C == 5) {
				count++;
			}
		} else if(A == 5 && B == 5) {
			if(C == 7) {
				count++;
			}
		}
		if(count == 3) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}

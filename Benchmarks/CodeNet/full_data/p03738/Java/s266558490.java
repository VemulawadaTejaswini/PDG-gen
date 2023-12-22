import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] A = sc.next().toCharArray();
		char[] B = sc.next().toCharArray();

		if(A.length > B.length) {
			System.out.println("GREATER");
			return;
		}else if(A.length < B.length) {
			System.out.println("LESS");
			return;
		}else {
			int i = 0;
			while(i < A.length) {
				if(A[i] > B[i]) {
					System.out.println("GREATER");
					return;
				}else if(A[i] < B[i]) {
					System.out.println("LESS");
					return;
				}
				i++;
			}
			System.out.println("EQUAL");
		}
	}
}
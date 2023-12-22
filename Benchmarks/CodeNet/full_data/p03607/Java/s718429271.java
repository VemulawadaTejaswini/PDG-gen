import java.util.*;
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N]; 
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
			for (int n = 0; n < i; n++) {
				if (A[n] == A[i]) {
					A[n] = A[i] = 0;
				}
			}
		}
		int number = 0;
		for (int j = 0; j < A.length; j++) {
			if (A[j] != 0) {
				number = number + 1;
			}
		}
		System.out.println(number);
	}
}
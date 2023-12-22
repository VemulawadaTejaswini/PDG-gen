import java.util.Scanner;
public class Main {
	public static boolean pal(int a) {
		int[] A = new int[5];
		for(int i =0; i < 5; i ++) {
			A[i] = a%10;
			a /= 10;
		}
		if(A[0] == A[4] && A[1] == A[3]) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int count = 0;
		
		for(int i = A; i <= B; i++) {
			if(pal(i)) {
				count++;
			}
		}
		System.out.println(count);

	}

}
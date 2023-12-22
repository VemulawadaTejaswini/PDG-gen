import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		
		int count = 0;
		boolean isEven = true;
		int N = input.nextInt();
		
		int[] A = new int[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = input.nextInt();
			if(A[i]%2 == 1) isEven = false;
		}
		while(isEven) {
			count++;
			for(int i = 0; i < N; i++) {
				A[i] /= 2;
				if(A[i]%2 == 1) {
					isEven = false;
					break;
				}
			}
		}
		
		System.out.println(count);
		
		
	}

}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		BufferedReader keyIn = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		boolean isEven = true;
		int N = input.nextInt();
		
		int[] A = new int[N];
		
		String[] tmp = keyIn.readLine().split(" ");

		for(int i = 0; i < tmp.length; i++) {
			A[i] = Integer.parseInt(tmp[i]);
		}
		
		for(int i = 0; i < N; i++) {
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
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int A[] = new int[N];
		int count = 0;
		int ans = 0;
		for (int i = 0; i < N; i++){
			A[i] = stdIn.nextInt();
			if(A[i] % 2 == 0){
				count++;
				if(A[i] % 3 == 0 || A[i] % 5 == 0){
					ans++;
				}
			}
		}
		if(ans == count){
			System.out.println("APPROVED");
		}
		else{
			System.out.println("DENIED");
		}
		stdIn.close();
	}
}
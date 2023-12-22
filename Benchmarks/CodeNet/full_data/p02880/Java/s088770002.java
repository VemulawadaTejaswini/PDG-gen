import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int A[][] = new int[9][9];
		int N = stdIn.nextInt();
		int ans = 0;

		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				A[i][j] = (i + 1) * (j + 1);
				if(N == A[i][j]){
					ans = 1;
				}
			}
		}
		if(ans == 1){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}

		stdIn.close();
	}
}

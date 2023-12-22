import java.util.Scanner;


public class Main {
	static int N;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			 N = sc.nextInt();
		sc.close();

		boolean t = false;
		int s = 0 ;
		for(int i = 2 ; i < 500 ; i++){
			if((i*(i-1))/2 == N){
				t = true;
				s = i;
				break;
			}
		}


		if(t){
			System.out.println("Yes");
			System.out.println(s);
			int C = (s*(s-1))/2;

			int[][] A = new int[s+1][C+1];
			int count = 1;

			for(int i = 1 ; i<=s ; i++){
				for(int j = i+1 ;j <=s ; j++){
				A[i][count] = count;
				A[j][count] = count;
				count++;
				}
			}
			String ans ="";
			for(int i = 1 ; i< s+1 ; i++){
				for(int j = 1 ;j <  C+1 ; j++){
					if(A[i][j] != 0){
						ans = ans + " " + Integer.toString(A[i][j]);
					}
				}
				System.out.println(s-1 + ans);
				ans = "";
			}
		}
		else{
			System.out.println("No");
		}
	}
}
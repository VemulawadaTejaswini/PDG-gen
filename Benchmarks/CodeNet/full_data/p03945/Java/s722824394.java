import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			String S = sc.next();
		sc.close();

		int[] A = new int[S.length()];
		A[0] = 1;
		for(int i =1  ; i < S.length() ; i++){
			if(S.substring(i, i+1).equals(S.substring(i-1,i))){
				A[i] = A[i-1];
			}
			else{
				A[i] = A[i-1]+1;
			}
		}
/*
		for(int i = 0 ; i < S.length(); i++){
			System.out.println(A[i]);
		}
*/
		System.out.println(A[S.length()-1]-1);


	}
}

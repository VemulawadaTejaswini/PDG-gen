import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();

		String S = sc.next();

		int[] kukan = new int[2*Q];
		for(int i = 0 ; i < 2*Q ; i++){
			kukan[i] = sc.nextInt()-1;
		}
		sc.close();

		int[] AC = new int[N];


		int count = 0;
		for(int i = 0 ; i < N-1 ; i++){
			if(S.substring(i, i+1).equals("A") && S.substring(i+1, i+2).equals("C")){
				count++;
			}
			AC[i+1] = count;
		}

/*
		for(int i = 0 ; i < N ; i++){
			System.out.println(AC[i]);
		}
*/
		for(int i = 0 ; i < 2*Q ; i+=2){
				System.out.println(AC[kukan[i+1]] - AC[kukan[i]]);
		}



	}
}
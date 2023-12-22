import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();

		String S = sc.next();

		int[] kukan = new int[2*Q];
		for(int i = 0 ; i < 2*Q ; i++){
			kukan[i] = sc.nextInt();
		}
		sc.close();

		for(int i = 0 ; i < 2*Q ; i+=2){
			int count = 0;
			for(int j = kukan[i] ; j < kukan[i+1] ; j++){

				if(S.substring(j-1, j).equals("A") && S.substring(j, j+1).equals("C")){
					count++;
				}
			}
			System.out.println(count);
		}
	}
}

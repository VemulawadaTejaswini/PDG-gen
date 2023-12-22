import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int K = sc.nextInt();
		
		for(int i = 1; i < K; i++){
			if(S.charAt(i) != 1){
				System.out.println(S.charAt(i));
				break;
			}
		}
		
	}

}

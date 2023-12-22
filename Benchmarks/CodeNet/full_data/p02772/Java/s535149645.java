import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		boolean judge = true;
		for (int i=0; i<N; i++){
			int A = sc.nextInt();
			if (A % 2 == 0){
				if ((A % 3 == 0 || A % 5 ==0) == false){
					judge = false;
					break;
				}
			}
		}
		if (judge){
			System.out.println("APPROVED");
		} else {
			System.out.println("DENIED");
		}

	}
}
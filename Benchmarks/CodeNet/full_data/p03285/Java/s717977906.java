import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int lim = N/4;
		int judge = 0;

		for(int i=0; i<=lim; i++) {
			if((N-4*i)%7 == 0) {
				judge += 1;
			}
		}if(judge != 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}

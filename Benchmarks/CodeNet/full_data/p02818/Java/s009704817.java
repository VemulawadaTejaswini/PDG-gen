import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		long A = stdIn.nextLong();
		long B = stdIn.nextLong();
		long K = stdIn.nextLong();

		for(int i = 0; i < K; i++){
			if(A > 0){
				A = A - 1;
			}
			else if(B > 0){
				B = B - 1;
			}
			else{
				break;
			}
		}
		System.out.println(A + " " + B);
		stdIn.close();
	}
}
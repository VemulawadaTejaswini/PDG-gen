import java.util.Scanner;

public class Main {

	public static void main(String args[]){

		Scanner cin = new Scanner(System.in);

		int A = cin.nextInt();
		int B = cin.nextInt();
		cin.close();

		String result = "Draw";

		if(A==B){
		}else{
			if(A==1||A>B){
				result = "Alice";
			}else{
				result = "Bob";
			}
		}

		System.out.println(result);
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int sum = A + B;

		if(sum >= 10){
			System.out.println("error");
		}else{
			System.out.println(sum);
		}


	}

}

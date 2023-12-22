import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int outcome = i%2 == 0? i : i*2;
		System.out.println(outcome);
		
	}

}

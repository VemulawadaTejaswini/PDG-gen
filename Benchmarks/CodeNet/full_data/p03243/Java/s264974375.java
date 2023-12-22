import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int debut = (int) (Math.ceil(n / 111.0) * 111);
		System.out.println(debut);

	}

}
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] input = new String[3];
		
		for (int i=0; i<3; i++) {
			input[i] = sc.nextLine();
		}
		
		Arrays.sort(input);
		
		System.out.println(input[0] + input[1] + input[2]);
		sc.close();
	}

}
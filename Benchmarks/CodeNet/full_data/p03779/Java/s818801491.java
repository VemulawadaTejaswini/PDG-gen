import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int X = scan.nextInt();
		int sum = 0;
		
		int i=1;
		while(X > sum){
			sum += i;
			i++;
		}
		
		System.out.println(i-1);
		
	}

}
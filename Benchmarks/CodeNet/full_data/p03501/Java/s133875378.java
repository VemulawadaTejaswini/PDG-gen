import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), a = scanner.nextInt(), b = scanner.nextInt();
		if((n * a) > b){
			System.out.println(b);
		}else if((n * a) <= b){
			System.out.println(a);
		}
	}

}

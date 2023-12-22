import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scan.nextInt();

		int first = scan.nextInt();
		int max = first;
		int min = first;
		for(int i = 1; i < n; i++) {
			int a = scan.nextInt();
			if(max < i) {
				max = a;
			}else if(min > i) {
				min = a;
			}
		}

		System.out.println(max - min);
    }
}

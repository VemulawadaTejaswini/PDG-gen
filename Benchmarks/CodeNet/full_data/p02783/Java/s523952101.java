import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int A = sc.nextInt();
		int a = 0;
		
		while (H <= 0) {
			H -= A;
			a++;
		}
		System.out.println(a);
	}

}

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i = 0;

		while(i*i <= N) {
			i++;
		}
		System.out.println((i-1)*(i-1));
	}

}

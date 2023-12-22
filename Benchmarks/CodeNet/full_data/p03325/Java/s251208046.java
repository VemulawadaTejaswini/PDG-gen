import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count =0;
		for (int i=0;i<N;i++) {
			int temp = sc.nextInt();
			while (temp%2==0) {
				count ++;
				temp/=2;
			}
		}
		System.out.println(count);
	}
}

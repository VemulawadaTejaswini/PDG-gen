import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), X = sc.nextInt();
		int sum = 0;
		int Count = 0;
		for(int i = 0; i < N; i++) {
			sum += sc.nextInt();
			Count++;
			if(sum > X) {
				break;
			}
		}
		System.out.println(Count);
	}
}
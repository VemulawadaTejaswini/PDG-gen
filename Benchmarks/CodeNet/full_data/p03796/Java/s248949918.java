import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int answer = 1;
		for(int i = 1;i <= N;i++){
			answer = answer * i % (10^9 + 7);
		}
		System.out.println(answer);
	}
}
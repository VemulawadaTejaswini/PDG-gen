
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		int X = scanner.nextInt();
		int Y = scanner.nextInt();
		int sum = 0;
		for(int i = 0 ; i<N;i++){
			sum += i<K?X:Y;
		}
		System.out.println(sum);
		scanner.close();
	}
}
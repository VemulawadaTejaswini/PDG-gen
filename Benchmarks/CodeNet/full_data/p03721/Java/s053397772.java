import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int count = 0;
		for(int i=0;i<n*2;i++){
			int p = scanner.nextInt();
			count += scanner.nextInt();

			if(count >= k){
				System.out.println(p);
				break;
			}
		}
	}
}
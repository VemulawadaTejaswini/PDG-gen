import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt()+1;
		int s = scanner.nextInt();
		int count = 0;
		for(int j = 0; j < k; j++)for(int l = 0; l < k; l++){
			if(s-(j+l) <= k && s-(j+l) >= 0)count++;
		}
		System.out.println(count);
	}
}
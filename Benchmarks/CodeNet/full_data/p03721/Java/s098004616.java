import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextlong();
		int k = scanner.nextlong();
		int count = 0;
		for(int i=0;i<n*2-1;i++){
			int p = scanner.nextlong();
			count += scanner.nextlong();
 
			if(count >= k){
				System.out.println(p);
				break;
			}
		}
	}
}
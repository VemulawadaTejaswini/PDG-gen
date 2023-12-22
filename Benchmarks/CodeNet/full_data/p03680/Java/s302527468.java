import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for(int i=0; i < n; i++){
			a[i] = scanner.nextInt();
		}
		int now = a[0];
		a[0] = -1;
		int count = 1;
		while(true){
			if(now == 2){
				System.out.println(count);
				break;
			}
			now = a[now - 1];
			count++;
			if(now == -1){
				System.out.println(-1);
				break;
			}
		}
	}
}

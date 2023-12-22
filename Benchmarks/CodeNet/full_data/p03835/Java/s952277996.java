import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt(); 
		int S = sc.nextInt(); 
		int cnt = 0;
		for(int x = 0; x <= K; x++) {
			for(int y = 0; y <= K; y++) {
				for(int z = 0; z <= K; z++) {
					if(x+y+z==S) cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
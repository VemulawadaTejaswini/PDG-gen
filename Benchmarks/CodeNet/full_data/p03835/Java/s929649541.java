import java.util.Scanner;

public class abc051 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int S = sc.nextInt();
		int ans = 0;
		for(int i=0; i<=K; i++) {
			for(int j=0; j<=K; j++) {
				for(int k=0; k<=K; k++) {
					if(i + j + k == S) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
		
		

	}

}
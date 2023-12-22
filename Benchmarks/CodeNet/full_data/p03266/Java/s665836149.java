
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		int count=0;
		

		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				for(int k=1;k<=N;k++) {
					if((i+j)%K==0&&(j+k)%K==0&&(i+k)%K==0) {
						count++;
					}
				}
			}
		}
		System.out.print(count);
	}
}

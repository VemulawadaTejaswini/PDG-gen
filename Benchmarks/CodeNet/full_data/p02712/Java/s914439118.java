
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		long ans = 0;
		for(int i = 1 ; i <=N ; i++) {
			if(i%3==0 && i%5 ==0) {
				//none
			}else if(i%3==0) {
				//none
			}else if(i%5==0) {
				//none
			}else {
				ans = ans + i;
			}
		}
		System.out.println(ans);
		scan.close();
	}
}

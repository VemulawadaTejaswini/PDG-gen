import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int high = 0;
		int count = 0;
		int max = 0;
		
		for(int i=1;i<=N;i++) {
			high = sc.nextInt();
			if(high <= max) {
				count = count + 1;
				max = high;
			}else {
				count = 0;
				max = high;
			}
		}
		System.out.println(count);
		
	}
}
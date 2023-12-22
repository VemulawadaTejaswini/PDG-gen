import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long Count = 0l;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < N; i++) {
			int ch = sc.nextInt();
			if(ch <= min) {
				Count++;
				min = ch;
			}
		}
		System.out.println(Count);
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int X = sc.nextInt();
		int count = 1;
		int point = 0;
		for (int i = 0; i < N; i++) {
			point += sc.nextInt();
			if(point<=X) {
				count++;
			}else {
				break;
			}
		}
      sc.close();
		System.out.println(count);
	}
}

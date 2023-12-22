import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int position = 0;
		int count =1;
		for (int i=0;i<N;i++) {
			int temp = sc.nextInt();
			position +=temp;
			if(position >X) {
				break;
			}
			count++;
		}
		System.out.println(count);
	}
}
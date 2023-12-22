import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = input.nextInt();
		}
		int UP = Integer.MIN_VALUE;
		int DOWN = Integer.MIN_VALUE;
		for (int TOP = 0; TOP < N; TOP++) {
			for (int BOT = TOP+1; BOT<N; BOT++) {
				int Num = Math.max(arr[TOP], arr[BOT]);
				int Den = Math.min(arr[TOP], arr[BOT]);
				if (Num>=UP&&Den>=DOWN&&Num-Den>=UP-DOWN) {
					UP=Num;
					DOWN=Den;
				}
			}
		}
		System.out.println(UP+" "+DOWN);
		//for int i = 0
	}
}
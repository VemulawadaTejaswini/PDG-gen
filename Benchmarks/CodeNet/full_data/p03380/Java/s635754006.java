import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[] arr = new int[N];
		int UP = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			arr[i] = input.nextInt();
			UP=Math.max(UP, arr[i]);
		}
		int DOWN = Integer.MIN_VALUE;
		/*for (int TOP = 0; TOP < N; TOP++) {
			for (int BOT = TOP+1; BOT<N; BOT++) {
				int Num = Math.max(arr[TOP], arr[BOT]);
				int Den = Math.min(arr[TOP], arr[BOT]);
				if (Num>=UP&&Den>=DOWN&&Num-Den>=UP-DOWN) {
					UP=Num;
					DOWN=Den;
				}
			}
		}*/
		int LDiff = 0;
		int RDiff = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			int L = arr[i];
			int R = arr[N-1]-arr[i];
			if (Math.abs(L-R)<=Math.abs(RDiff-LDiff)) {
				RDiff = arr[N-1]-arr[i];
				LDiff = arr[i];
				DOWN=arr[i];
			}
		} 
		System.out.println(UP+" "+DOWN);
		//for int i = 0
	}
}
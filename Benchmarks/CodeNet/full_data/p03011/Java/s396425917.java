import java.util.*;
public class Main {
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		int Q = sc.nextInt();
		int R = sc.nextInt();
		sc.close();

		int[] arr = new int[]{P + Q, Q + R, R + P};

		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			int v = arr[i];
			if (v < min) {
				min = v;
			}
		}
		System.out.println(min);
	
	}
}
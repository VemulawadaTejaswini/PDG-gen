import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] usa = new int[N+1];
		for (int i = 1; i < N+1; i++) {
			usa[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 1; i < N+1; i++) {
			if (i == usa[usa[i]]) {
				count++;
			}
		}
		System.out.println(count/2);
	}
}
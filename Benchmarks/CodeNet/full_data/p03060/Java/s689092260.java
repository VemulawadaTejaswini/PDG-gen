import java.util.Scanner;
public class Main{

	public static void main(String[] args){

		Main main = new Main();
		main.solve();
	}

	private void solve() {

		Scanner sc = new Scanner (System.in);

		int N = sc.nextInt();

		int[] value = new int[N];
		int[] cost = new int [N];

		for (int index=0; index<N; index++) {
			value[index]=sc.nextInt();
		}

		for (int index=0; index<N; index++) {
			cost[index]=sc.nextInt();
		}

		int amount = 0;

		for (int index=0; index<N; index++) {
			if (value[index]-cost[index]>0) {
				amount+=value[index]-cost[index];
			}
		}

		System.out.println(amount);
	}
}
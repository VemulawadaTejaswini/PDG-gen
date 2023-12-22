import java.util.Scanner;
public class Main{

	public static void main(String[] args){

		Main main = new Main();
		main.solve();
	}

	private void solve() {

		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		int[] list = new int [N];
		for (int index=0; index<N; index++) {
			list[index]=sc.nextInt();
		}
		long answer = calculate(N,list,0);

		System.out.println(answer);
	}

	private long calculate(int N, int[] list, int number) {
		if (number==N-1) {
			long answer = 0;
			for (int index=0; index<N; index++) {
				answer+=list[index];
			}
			return answer;
		}

		if (list[number]>0&&list[number+1]>0) {
			return calculate (N,list,number+1);
		} else if (list[number]<0&&list[number]<0) {
			list = change (list, number);
			list = change (list, number+1);
			return calculate (N, list, number+1);
		}
		long ans1 = calculate(N,list,number+1);
		list = change (list, number);
		list = change (list, number+1);
		long ans2 = calculate(N,list,number+1);

		if (ans1>ans2) {
			return ans1;
		} else {
			return ans2;
		}
	}

	private int[] change (int[] list, int index) {
		if (list[index]>0) {
			list[index]-=list[index]*2;
		} else {
			list[index]=Math.abs(list[index]);
		}
		return list;
	}
}
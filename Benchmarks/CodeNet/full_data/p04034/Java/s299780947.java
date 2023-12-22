import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int[] x = new int[M];
		int[] y = new int[M];
		for(int i = 0; i < M; i++) {
			x[i] = Integer.parseInt(sc.next());
			y[i] = Integer.parseInt(sc.next());
		}

		int[] num = new int[N];
		boolean[] red = new boolean[N];
		for(int i = 0; i < N; i++) {
			num[i] = 1;
			red[i] = false;
		}
		red[0] = true;

		for(int i = 0; i < M; i++) {
			if(red[x[i]-1]) red[y[i]-1] = false;
			num[x[i]-1] = num[x[i]-1]-1;
			num[y[i]-1] = num[y[i]-1]+1;
			if(num[x[i]-1] == 0) red[x[i]-1] = false;
		}

		int result = 0;
		for(boolean b : red) {
			if(b) result++;
		}

		System.out.println(result);

//		int[] result = new int[N];
//		for(int i : result) result[i] = 1;
//
//		for(int i = 0; i < M; i++) {
//			result[x[i]-1]--;
//			result[y[i]-1]++;
//		}
//
//		int prob = 0;
//		for(int i = 0; i < result.length; i++) {
//			if(result[i] > 0) prob++;
//		}
//
//		System.out.println(prob);


	}

}

class Box {
	int numofrb;
	int numofwb;

	Box(int rb, int wb) {
		numofrb = rb;
		numofwb = wb;
	}
}

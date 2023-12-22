import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int[] x = new int[N];
		int[] y = new int[M];
		for(int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
		}
		for(int i = 0; i < M; i++) {
			y[i] = sc.nextInt();
		}

		boolean warflag = true;

		for(int z = X + 1; z <= Y; z++) {
			boolean flag = false;
			for(int j = 0; j < x.length; j++) {
				if(!(x[j] < z)) {
					flag = true;
					break;
				}
			}
			if(flag)continue;
			for(int j = 0; j < y.length; j++) {
				if(!(y[j] >= z)) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				warflag = false;
				break;
			}


		}
		System.out.println(warflag ?  "War" : "No War");

	}

}

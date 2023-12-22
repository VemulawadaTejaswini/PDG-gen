import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = Integer.parseInt(sc.next());
		int Y = Integer.parseInt(sc.next());

//		int[] a = new int[N + 1];
//		for(int i = 1;i <= N;i++) {
//			a[i] = Integer.parseInt(sc.next());
//		}

//		String s = sc.next();

		sc.close();

		int ret = 0;

		if(X == 1) {
			ret += 300000;
		}else if(X == 2) {
			ret += 200000;
		}else if(X == 3) {
			ret += 100000;
		}
		if(Y == 1) {
			ret += 300000;
		}else if(Y == 2) {
			ret += 200000;
		}else if(Y == 3) {
			ret += 100000;
		}
		if(X == 1 && Y == 1) {
			ret += 400000;
		}



//		for(int i = 1;i <= N;i++) {
//			System.out.print(a[i]);
//		}

		System.out.println(ret);



	}
}


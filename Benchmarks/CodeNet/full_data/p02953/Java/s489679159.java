import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s = sc.next();
		int N = sc.nextInt();
		int count=0;
		long[] array = new long[N];
		long max = 0;

		for(int i=0;i<N;i++) {
			array[i] = sc.nextLong();
		}
		for(int i=0;i<N;i++) {
			if(max <= array[i]) {
				max = array[i];
			}
			if(max - array[i] >= 2) {
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");
	}


	public static int sample() {
		return 1;
	}

}

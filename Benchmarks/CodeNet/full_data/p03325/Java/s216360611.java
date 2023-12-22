import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		partC100();
	}


	public static void partC100() {
		Scanner scC = new Scanner(System.in);
		boolean bool = false;
		int count = 0;
		int N = scC.nextInt();
		int[] a = new int[N];

		for(int i = 0 ; i < N ; i++) {
			a[i] = scC.nextInt();
		}


		for(int j = 0 ; j < N ; j++) {
			if(a[j] % 2 == 0) {
				while(a[j] % 2 == 0) {
					a[j] /= 2;
					count++;
				}
				bool = true;
			}
		}


		if(bool) {
			System.out.println(count);
		}else {
			System.out.println(0);
		}

	}
}
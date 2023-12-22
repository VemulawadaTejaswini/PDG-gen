

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		long a[] = new long[3];

		for(int i = 0; i < 3; i++){
			a[i] = sc.nextInt();

			if(a[i] % 2 == 1){
				System.out.println(0);
				return;
			}
		}

//		Arrays.sort(a);

		if(a[2] == a[1] && a[1] == a[0]){
			System.out.println(-1);
			return;
		}

		int count = 0;

		while(true){
			if(a[0] % 2 == 1 || a[1] % 2 == 1 || a[2] % 2 == 1){
				break;
			}
			count++;

			long s = a[0];
			long t = a[1];
			long u = a[2];

			a[0] = (t + u)/2;
			a[1] = (s + u)/2;
			a[2] = (s + t)/2;
		}

		System.out.println(count);

	}
}

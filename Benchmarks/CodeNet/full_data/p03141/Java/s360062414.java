import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int a[] = new int[n];
		int b[] = new int[n];

		for(int i = 0; i < n ; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

		int acount = 0;
		int bcount =0;

		for(int i = 0; i < n; i++) {
			int aMax = 0;
			int bMax = 0;
			int index = 0;
			if(i % 2 == 0) {
				for(int j = 0; j < n; j++) {
					if(aMax <= a[j]) {
						aMax = a[j];
						index = j;
					}
				}
				a[index] = 0;
				b[index] = 0;
				acount += aMax;
			}
			else {
				for(int j = 0; j < n; j++) {
					if(bMax <= b[j]) {
						bMax = b[j];
						index = j;
					}
				}
				a[index] = 0;
				b[index] = 0;
				bcount += bMax;
			}

		}

		System.out.println(acount - bcount);
	}

}
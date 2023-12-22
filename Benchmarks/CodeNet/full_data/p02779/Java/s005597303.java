import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();
		long a[] = new long[(int)N];

		for(int i=0;i<N;i++) {
			a[i] = sc.nextLong();

		}

		for(int k=0;k<N;k++) {
			for(int j=k+1;j<N;j++) {
				if(a[k]==a[j]) {
					System.out.println("NO");
					return;
				}
			}

		}


		System.out.println("YES");
	}
}
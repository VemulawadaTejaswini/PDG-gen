import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int ans = 0;

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int d = sc.nextInt();
//
		boolean f = true;
		int[] array = new int[n];
		int[] array2 = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
			if(array[i] != i+1) {
				f=false;
			}
		}

		if(f) {
			System.out.println("YES");
			sc.close();
			return;
		}
		f= true;

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				f = true;
				System.arraycopy(array,0,array2,0,n);
				array2[j] = array[i];
				array2[i] = array[j];
				for(int k= 0;k<n;k++) {
					if(array2[k] != k+1) {
						f = false;
						break;
					}
				}
				if(f) {
				System.out.println("YES");
				sc.close();
				return;
				}

			}
		}
		System.out.println("NO");

		sc.close();
	}
}
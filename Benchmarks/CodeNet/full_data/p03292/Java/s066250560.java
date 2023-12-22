import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] a = new int[3];

		for(int i=0;i<3;i++) {

			a[i] = sc.nextInt();
		}

		int temp = 0;

		for(int i=0;i<2;i++) {

			for(int j=i;j<3;j++) {

				if(a[i]>a[j]) {

					temp = a[i];

					a[i] = a[j];

					a[j] = temp;
				}
			}
		}


		int ans = 0;

		for(int i=0;i<2;i++) {

			ans += (a[i+1]-a[i]);

		}

		System.out.println(ans);

	}

}

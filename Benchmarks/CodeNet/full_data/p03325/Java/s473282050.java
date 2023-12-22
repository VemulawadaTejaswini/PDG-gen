import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] a = new int[n];


		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}

		boolean b = true;
		boolean flag = false;

		int temp = 0;


		for(int i=0;i<n-1;i++) {
			for(int j=i;j<n;j++) {
				if(a[i]<a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		int x = 0;

		while(b == true) {

			flag = false;

			for(int i=0;i<a.length;i++) {

				if(a[i]%2==0 && flag == false) {
					a[i] = a[i] /2;
					flag = true;
				}else {
					a[i] *= 3;
				}
			}

			if(flag == false) break;
			x++;
		}


			System.out.println(x);



	}
}

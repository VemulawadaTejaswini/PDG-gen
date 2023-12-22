import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] a = new int[N];

		int[] b = new int[N];

		double sum = 0;

		double ave = 0;

		for(int i=0;i<N;i++) {

			a[i] = sc.nextInt();

			b[i] = a[i];

			sum += a[i];

		}

		ave = sum/a.length;

		sort(a);

		boolean flag = false;

		int c = 0;

		for(int i=0;i<N;i++) {

			if(ave<=a[i]) {

				c = i;

				break;
			}
		}

		if(c-1>=0 && (Math.abs(ave-a[c])>Math.abs(ave-a[c-1]))){

			c = c-1;

		}

		for(int i=0;i<N;i++) {

			if(b[i] == a[c]) {

				System.out.println(i);

				break;
			}
		}
	}

	public static void sort(int[] a) {

		for(int i=1;i<a.length;i++) {

			int j = i;

			while(j>=1 && a[j-1]>a[j]) {

				int temp = a[j];

				a[j] = a[j-1];

				a[j-1] = temp;

				j--;
			}
		}
	}

}

//c
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int K = sc.nextInt();

		int[] tree = new int[N];

		for(int i=0;i<N;i++) tree[i] = sc.nextInt();

		sort(tree);

		int max_min = 1000000000;

		for(int i=0;i+K-1<N;i++) {

			//System.out.println(tree[i]);
			if(tree[i+K-1]-tree[i] < max_min) max_min = tree[i+K-1]-tree[i];
		}

		System.out.println(max_min);

	}

	public static void sort(int[] a) {

		int h;

		for(h=1; h<a.length/9; h=h*3+1);

		for(;h>0;h/=3) {

			for(int i=h; i<a.length; i++) {

				for(int j=i; j>=h && a[j-h]>a[j]; j-=h) {

					int temp = a[j];

					a[j] = a[j-h];

					a[j-h] = temp;
				}

			}
		}
	}


}

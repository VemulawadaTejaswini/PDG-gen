//c
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int m = sc.nextInt();

		int[] x = new int[m];

		x[0] = sc.nextInt();

		int min = x[0];

		int max = 0;

		for(int i=1;i<m;i++) {

			x[i] = sc.nextInt();

			if(max<x[i]) max = x[i];

			if(min>x[i]) min = x[i];
		}

		if(n==1&&m==1) {
			System.out.println(0);
		}else if(n==1) {

			System.out.println((max-min));

		}else if(m==1){
			System.out.println(0);
		}else if(n==2) {

			int maxx = 0;

			Arrays.sort(x);

			for(int i=1;i<m;i++) {

				int a = Math.abs(x[i]-x[i-1]);

				if(maxx<a) maxx = a;
			}

			System.out.println((max-min-maxx));

		}	else {

			Arrays.sort(x);

			int a = 0;

			int b = 0;

			ArrayList<Integer> array = new ArrayList<>();
			ArrayList<Integer> aa = new ArrayList<>();

			for(int i=1;i<m;i++) {

				a = x[i]-x[i-1];

				aa.add(a);

			}

			Collections.sort(aa);

			for(int i=0;i<n-1;i++) {

				if(aa.size()-i-1>=0)b += aa.get(aa.size()-i-1);
			}

			//System.out.println(b);
			System.out.println((max-min-b));


		}

	}

}

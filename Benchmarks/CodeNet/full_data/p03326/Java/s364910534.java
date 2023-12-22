
import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int M = scanner.nextInt();

		long[] xi = new long[N];
		long[] yi = new long[N];
		long[] zi = new long[N];

		for (int i = 0; i < N; i++) {
			xi[i] = scanner.nextLong();
			yi[i] = scanner.nextLong();
			zi[i] = scanner.nextLong();
		}

		long[] total = new long[N];
		for(int i = 0; i< N;i++) {
			total[i]=xi[i]+yi[i]+zi[i];
		}



		long[] total000 = new long[N];
		long[] total001 = new long[N];
		long[] total010 = new long[N];
		long[] total011 = new long[N];
		long[] total100 = new long[N];
		long[] total101 = new long[N];
		long[] total110 = new long[N];
		long[] total111 = new long[N];


		for (int i = 0; i < total000.length; i++) {
			total000[i] = -xi[i]-yi[i]-zi[i];
		}
		for (int i = 0; i < total001.length; i++) {
			total001[i] = -xi[i]-yi[i]+zi[i];
		}
		for (int i = 0; i < total010.length; i++) {
			total010[i] = -xi[i]+yi[i]-zi[i];
		}
		for (int i = 0; i < total011.length; i++) {
			total011[i] = -xi[i]+yi[i]+zi[i];
		}
		for (int i = 0; i < total100.length; i++) {
			total100[i] = xi[i]-yi[i]-zi[i];
		}
		for (int i = 0; i < total101.length; i++) {
			total101[i] = xi[i]-yi[i]+zi[i];
		}
		for (int i = 0; i < total110.length; i++) {
			total110[i] = xi[i]+yi[i]-zi[i];
		}
		for (int i = 0; i < total111.length; i++) {
			total111[i] = xi[i]+yi[i]+zi[i];
		}



		Arrays.sort(total000);
		Arrays.sort(total001);
		Arrays.sort(total010);
		Arrays.sort(total011);
		Arrays.sort(total100);
		Arrays.sort(total101);
		Arrays.sort(total110);
		Arrays.sort(total111);

		long score000 = getTotal(total000,M);
		long score001 = getTotal(total001,M);
		long score010 = getTotal(total010,M);
		long score011 = getTotal(total011,M);
		long score100 = getTotal(total100,M);
		long score101 = getTotal(total101,M);
		long score110 = getTotal(total110,M);
		long score111 = getTotal(total111,M);

		long max = Long.MIN_VALUE;
		max = (max > score000)?max : score000;
		max = (max > score001)?max : score001;
		max = (max > score010)?max : score010;
		max = (max > score011)?max : score011;
		max = (max > score100)?max : score100;
		max = (max > score101)?max : score101;
		max = (max > score110)?max : score110;
		max = (max > score111)?max : score111;

		System.out.println(max);



	}

	public static long getTotal(long[] ar,int m) {
		long ans = 0;
		for (int i = 0; i < m; i++) {
			ans += ar[ar.length-i-1];
		}
		return ans;
	}

}

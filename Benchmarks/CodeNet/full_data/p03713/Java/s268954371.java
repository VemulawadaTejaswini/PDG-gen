import java.util.*;

public class Main {
	private long[] trarray = new long[3];
	private long minDiv;

	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		Main soln = new Main();
		soln.minDiv = m*n;
		long[] temp = new long[3];
		for(int i=1; i<=m/2; i++) {
			temp[0] = (long)i*n;
			soln.digR(temp, m-i, n);
			soln.digC(temp, m-i, n);
		}
		for(int i=1; i<=n/2; i++) {
			temp[0] = (long)i*m;
			soln.digR(temp, m, n-i);
			soln.digC(temp, m, n-i);
		}
		System.out.println(soln.minDiv);
	}

	private void digR(long[] temp, int m, int n) {
		long div;
		int j = m/2;
		temp[1] = (long)j*n;
		temp[2] = (long)(m-j)*n;
		this.trarray = Arrays.copyOf(temp, temp.length);
		Arrays.sort(this.trarray);
		div = this.trarray[2] - this.trarray[0];
		this.minDiv = (div<this.minDiv)? div:minDiv;
	}

	private void digC(long[] temp, int m, int n) {
		long div;
		int j = n/2;
		temp[1] = (long)j*m;
		temp[2] = (long)(n-j)*m;
		this.trarray = Arrays.copyOf(temp, temp.length);
		Arrays.sort(this.trarray);
		div = this.trarray[2] - this.trarray[0];
		this.minDiv = (div<this.minDiv)? div:minDiv;
	}
}
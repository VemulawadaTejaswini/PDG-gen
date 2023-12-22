import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int a[] = new int[N+1];
		for(int i=0;i<N+1;i++) a[i]=scanner.nextInt();
		int b[] = new int[N];
		for(int i=0;i<N;i++) b[i]=scanner.nextInt();

		int defeated=0;



		for(int i=0;i<N;i++) {
			int tmp1 = b[i];
			int tmp2 = a[i];
			b[i]-= a[i];
			if(b[i] >= 0) {
				defeated += tmp2;
				int tmp3=b[i];
				int tmp4=a[i+1];
				b[i] -= a[i+1];
				if(b[i] >= 0) defeated += tmp4;
				else defeated += tmp3;

			}else defeated +=tmp1;
		}

		System.out.println(defeated);

		scanner.close();
	}
}
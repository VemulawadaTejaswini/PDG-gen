import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] a  = new int[N];
		int[] b  = new int[1000000];
		
		for (int i=0; i<N; i++){
			a[i] = sc.nextInt();
		}
		
		for (int i=0; i<N; i++){
			b[a[i]+1]++;
			if (a[i] != 0){
				b[a[i]-1]++;
			}
			b[a[i]]++;
		}
		
		int ret =0;
		for (int i=0; i<1000000; i++){
			if (ret < b[i]){
				ret = b[i];
			}
		}
		
		System.out.println(ret);
		
	}

}

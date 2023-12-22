import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}



	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long a[] = new long[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextLong();
		}
		Arrays.sort(a);
		long h=0;
		long w=0;
		for(int i=n-2; i>=0; i--) {
			if(a[i+1] == a[i] && h==0) {
				h=a[i+1];
				i--;
			}
			else if(a[i+1] == a[i] && w==0) {
				w=a[i+1];
				i--;
			}
			if(h>0 && w>0) {
				break;
			}
		}
		System.out.println(h*w);
		sc.close();
	}

}

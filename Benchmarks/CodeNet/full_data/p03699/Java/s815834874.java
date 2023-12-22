
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		int sum=0;
		int min=-1;
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
			if(a[i]%10 != 0) {
				if(min == -1 || a[i]<min) {
					min=a[i];
				}
			}
			sum += a[i];
		}
		if(sum%10 == 0) {
			if(min == -1) {
				sum=0;
			} else {
				sum -= min;
			}
		}
		System.out.println(sum);
		sc.close();
	}
}



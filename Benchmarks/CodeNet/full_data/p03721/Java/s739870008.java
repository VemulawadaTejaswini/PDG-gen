import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long k=sc.nextLong();
		long arr[] = new long[100000+5];
		for(int i=0; i<n; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			arr[a] += b;
		}
		long sum = 0;
		int ans = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			if(sum>=k) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
		sc.close();
	}


}

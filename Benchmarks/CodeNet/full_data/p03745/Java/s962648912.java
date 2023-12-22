import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for(int i=0;i<n;i++) a[i] = sc.nextLong();
		sc.close();

		int count1 = 0;
		for(int i=2;i<n;i++){
			if((a[i]-a[i-1])*(a[i-1]-a[i-2])<0){
				count1 ++;
				i ++;
			}
		}
		long[] b = new long[n];
		int count2 = 0;
		for(int i=0;i<n;i++) b[i] = a[n-1-i];
		for(int i=0;i<n;i++) a[i] = b[i];
		for(int i=2;i<n;i++){
			if((a[i]-a[i-1])*(a[i-1]-a[i-2])<0){
				count2 ++;
				i ++;
			}
		}
		System.out.println(Math.min(count1, count2)+1);

	}

}

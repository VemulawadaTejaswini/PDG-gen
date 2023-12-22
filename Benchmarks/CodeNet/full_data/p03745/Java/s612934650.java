import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for(int i=0;i<n;i++) a[i] = sc.nextLong();
		sc.close();

		int count = 0;
		for(int i=2;i<n;i++){
			if((a[i]-a[i-1])*(a[i-1]-a[i-2])<0){
				count ++;
				i ++;
			}
		}
		System.out.println(count+1);

	}

}
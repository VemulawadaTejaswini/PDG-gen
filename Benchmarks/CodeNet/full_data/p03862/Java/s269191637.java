import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(),x = scanner.nextInt();
		int[] a = new int[n];
		long count = 0;
		for(int i=0;i<n;i++){
			a[i] = scanner.nextInt();
			if(a[i] > x){
				count += a[i] - x;
				a[i] = x;
			}
		}
		for(int i=1;i<n;i++){
			if((a[i]+a[i-1]) > x){
				count += (a[i] + a[i-1]) - x;
				a[i] = a[i-1] - x;
			}
		}
		System.out.println(x);
		
	}

}

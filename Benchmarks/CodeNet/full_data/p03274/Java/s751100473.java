import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();

		int x[] = new int[n];
		for(int i=0;i<n;i++){
			x[i]=scanner.nextInt();
		}
		
		long min=1000000000000000000l;
		for(int i=0;i<=n-k;i++){
			long dis=Math.abs(x[i])+Math.abs(x[i+k-1]-x[i]);
			min=Math.min(min, dis);
		}

		System.out.println(min);
	}
}
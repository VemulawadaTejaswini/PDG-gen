import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arrayv=new int[n],arrayc=new int[n];
		int sum=0;

		for(int i=0;i<n;i++) {
			arrayv[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			arrayc[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			sum+=Math.max(0, arrayv[i]-arrayc[i]);
		}

		System.out.println(sum);
	}
}

//Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));



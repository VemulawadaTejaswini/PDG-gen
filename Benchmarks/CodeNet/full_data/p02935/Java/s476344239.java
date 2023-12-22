import java.util.Arrays;
import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double sum =0;
		double a[] = new double [N];
		for(int i = 0;i<N;i++) {
			a[i]=sc.nextInt();
		}
        Arrays.sort(a);
		sum = (a[0]+a[1])/2;
		for(int b=2;b<N;b++) {
			sum=(sum+a[b])/2;
		}
		System.out.println(sum);
	}
 
}
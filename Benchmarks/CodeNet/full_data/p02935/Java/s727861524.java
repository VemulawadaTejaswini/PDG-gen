import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] arr = new double[N];
		double end = 0;
		double output = 0;
		
		if(N%2==0) {
			for(int i = 0;i<N;i++)arr[i] = sc.nextDouble();
			Arrays.sort(arr);
			for(int i = 0;i<N/2;i+=2) {
				output+= (arr[i]+arr[i+1])/2;
			}
			System.out.println(output);
		}else {
			for(int i = 0;i<N;i++)arr[i] = sc.nextDouble();
			Arrays.sort(arr);
			end = arr[N-1];
			for(int i = 0;i<N/2;i+=2) {
				output+= (arr[i]+arr[i+1])/2;
			}
			System.out.println((output+end)/2);
		}
		
		

	}

}

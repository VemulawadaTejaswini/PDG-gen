import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int x = in.nextInt();
		int a[] = new int[N];
		for(int i=0; i<N; i++)
		{
			a[i] = in.nextInt();
		}
		
		Arrays.sort(a);
		int time = a[0];
		
		for(int i=1; i<N; i++)
		{
			if (a[i] <= x+a[0])
			{
				time += a[i];
			} else {
				time += a[0] + x;
			}
		}
		System.out.println(time);
	}
}

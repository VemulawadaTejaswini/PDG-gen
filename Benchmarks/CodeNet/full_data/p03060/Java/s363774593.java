import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args)
	{
		new Main().run();
	}
	
	public void run()
	{
		Scanner file = new Scanner(System.in);
		int N = file.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		int ans = 0;
		for(int i = 0;i<N;i++)
			a[i] = file.nextInt();
		for(int i = 0;i<N;i++)
			b[i] = file.nextInt();
		for(int i = 0;i<N;i++)
			ans += Math.max(0,a[i]-b[i]);
		System.out.println(ans);
	}
	
}

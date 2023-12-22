import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int d[] = new int[N];
		for(int i=0; i<N; i++) d[i] = sc.nextInt();
		sc.close();
		int cur = 0, count = 0;
		
		Arrays.sort(d); //昇順
		for(int i=0; i<N; i++) {
			if(cur != d[i]) count++;
			cur = d[i];
		}
		
		System.out.println(count);
	}
}
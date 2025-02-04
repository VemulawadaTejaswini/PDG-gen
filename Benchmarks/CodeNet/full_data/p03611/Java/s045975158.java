import java.util.Arrays;
import java.util.Scanner;

public class Main {
  
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	int N = in.nextInt();
	int a[] = new int[100001];
	int ans = 0;
	Arrays.fill(a, 0);

	for(int cnt = 0; cnt < N; cnt++){
		int input = in.nextInt();
		a[input]++;
	}

	for(int cnt = 2; cnt < 100000; cnt++){
		int tmp = a[cnt-1]+a[cnt]+a[cnt+1];
		if(ans < tmp){
			ans = tmp;
		}

	}

	System.out.println(ans);

}
}
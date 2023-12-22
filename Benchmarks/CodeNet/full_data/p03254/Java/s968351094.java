import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long X = sc.nextLong();
		long a[] = new long [N];

		for(int i = 0; i < N; i++) {
			a[i] = sc.nextLong();
		}

		Arrays.sort(a);

		int cnt = 0;

		for(long i : a) {
            X -= i;
            
            if(X < 0) {
            	break;
            }else {
            	cnt++;
            }
        }

		System.out.print(cnt);
		sc.close();
	}

}

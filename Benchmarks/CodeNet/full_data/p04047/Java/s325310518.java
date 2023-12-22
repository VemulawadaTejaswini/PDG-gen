import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] Ls = new int[101];
		for (int i = 0; i < 101; i++) {
		    Ls[i] = 0;
		}
		for (int i = 0; i < 2 * N; i++) {
		    Ls[sc.nextInt()]++;
		}
		int ans = 0;
		boolean lest = false;
		int lestLength = 0;
		for (int i = 0; i < 101; i++) {
		    int currentLength = Ls[i];
		    if (currentLength > 0) {
		        if (lest) {
		            ans += lestLength;
		            currentLength--;
		            lest = false;
		        }
		        ans += i * (currentLength / 2);
		        if (currentLength % 2 == 1) {
		            lest = true;
		            lestLength = i;
		        }
		    }
		}
		System.out.println(ans);
	}
}
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner SC = new Scanner(System.in);
int N = SC.nextInt();
int K = SC.nextInt();
int[] Array = new int[N];
for(int i = 0; i < N; i++) {
	Array[i] = SC.nextInt();

Arrays.sort(Array);
int ans = 1000000000;
ans = Math.min(ans,Array[i] - Array[i - K + 1]);
}	
	}

}
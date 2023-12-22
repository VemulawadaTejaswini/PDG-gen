import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int N = Integer.parseInt(sc.next());
		int X = rand.nextInt(N-1);
		int count = 0;
		int H[] = new int[N];
		for(int i=0; i<=N-1; i++) {
			H[i] = rand.nextInt(9999999) + 1;
		}
		for(;H[X]>=H[X+1] && X+1<=N-1; X++) {
			count +=1;
		}
		System.out.print(count);
	}
}

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = 0;
		int B = 0;
		Integer[] card = new Integer[N];
		for (int i = 0; i < N; i++) {
			card[i] = sc.nextInt();
		}
		Arrays.sort(card, Collections.reverseOrder());
		for (int i = 0; i < card.length; i++) {
			if (i%2 == 0) A += card[i];
			else B += card[i];
		}
		System.out.println(A-B);
	}	
}
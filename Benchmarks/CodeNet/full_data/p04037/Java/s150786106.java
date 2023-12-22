import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer[] arr = new Integer[N];
		for(int i = 0; i<N; i++) arr[i] = sc.nextInt();
		Arrays.sort(arr);
		int decrement = 0;
		boolean turn = true;	//true = first, false = second
		int i = N-1;
		while(i >= 0){
			int current = arr[i];
			current -= decrement;
			if(current > 0){
				//eat pile
				i--;
				decrement++;
				turn = !turn;
			}
			else{
				//no piles left
				break;
			}
		}
		if(turn) System.out.println("Second");
		else System.out.println("First");
	}	
}
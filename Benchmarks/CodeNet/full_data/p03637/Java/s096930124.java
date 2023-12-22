import java.io.*;
import java.math.*;
import java.util.*;
public class Main { //WOOOOOO
 
	public static void main(String[] args) {  
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int T = 0;
		int F = 0; //Two and four
		int bad = 0;
		for (int i = 0; i < N; i++) {
			int x = input.nextInt();
			if (x%4==0) F++;
			else if (x%2==0) T++;
			else bad++;
		}
		if (T>=1&&T<N) { //2 2 2 2... 2 works
			bad++;//2 2 1 4 1 doesn't work
		}  //multiples of two can be joined as one contiguous sub-array since 2^2 = 4
		if (F>=1) {
			F++; //3 4s handle 4 bad slots ---> {bad,4,bad,4,bad,4,bad} --> x 4s handle x+1 bad slots
			bad-=F;
		}
		System.out.println(bad<=0?"Yes":"No");
	}
}
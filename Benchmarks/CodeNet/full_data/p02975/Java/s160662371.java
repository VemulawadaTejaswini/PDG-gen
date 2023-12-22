import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		boolean bad=false;
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = input.nextInt();
		}
		for (int cur = 0; cur < N; cur++) {
			int L = cur-1;
			int R= cur+1;
			if (L<0) L+=N;
			R%=N;
			int target = arr[cur];
			if ((arr[L]^arr[R])!=target) { //Bit operations need parenthesis
				bad=true;
				break;
			}
		}
		System.out.println(bad?"No":"Yes");
	}	
}

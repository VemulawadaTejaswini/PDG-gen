import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] digit = new int[N];
		Arrays.fill(digit, -1);

		boolean error = false;
		for(int i = 0; i < M; i++){
			if(!error){
				int x = sc.nextInt()-1;
				int y = sc.nextInt();
				if(digit[x] == -1 || digit[x] == y)digit[x] = y;
				else error = true;
			}
			else break;
		}

		StringBuffer sb = new StringBuffer("");

		if(!error){
			for(int i = 0; i < N; i++){
				if(digit[i] != -1)sb.append(digit[i]);
				else sb.append(0);
			}
		}

		if(!error){
			if(String.valueOf(Integer.valueOf(sb.toString())).length() != N){
				error = true;
			}
		}

		System.out.println((error)?-1:sb.toString());
	}
}
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int len = s.length();

		int[] A = new int[len];
		int[] B = new int[len];

		int i;
		for(i = 0; i < len; i++) {
			A[i] = i % 2;
			B[i] = (i + 1) % 2;
		}

		int tempA = 0;
		int tempB = 0;
		int intS;
		for(i = 0; i < len; i++) {
			intS = Integer.parseInt(s.substring(i, i + 1));

			if(intS != A[i])
				tempA++;

			if(intS != B[i])
				tempB++;
		}

		System.out.println(Math.min(tempA, tempB));
	}
}

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		char[] S = sc.next().toCharArray();
		int count = 0;
		int countf = 0;
		for(int i = 0; i < S.length; i++) {
			if(S[i] == 'a' && count < A + B) {
				System.out.println("Yes");
				count++;
			}
			else if(S[i] == 'b' && count < A + B && countf < B) {
				System.out.println("Yes");
				count++;
				countf++;
			}
			else {
				System.out.println("No");
			}
		}
	}
}
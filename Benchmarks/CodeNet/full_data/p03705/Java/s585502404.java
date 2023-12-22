import java.util.*;
 
public class Main {
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (B < A || (N == 1 && A != B)) {
			System.out.println(0);
		} else if (A == B) {
			System.out.println(1);
		} else {
			int min = A+B+(N-2)*A;
			int max = A+B+(N-2)*B;
			System.out.println(max-min+1);
		}
	}
}
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int calA = A;
		int calB = B;
		int tmp;
		while (true) {
			tmp = calB;
			calB = calA%calB;
			calA = tmp;
			if (calB == 0) {
				break;
			}
		}
		System.out.println(A * B / tmp);
	}
}
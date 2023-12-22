import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] A = new int [5];
		int sur = 10;
		int num = 0;
		for (int i=0;i<5;i++) {
			A[i]= sc.nextInt();
			if (sur > A[i] % 10 && A[i] % 10 != 0) {
				sur = A[i];
				num = i;
				//System.out.println(num);
			}
		}
		int sum = 0;
		for (int i=0;i<5;i++) {
			if (num == i)
				sum += A[i];
			else 
				sum += (A[i] /10 + 1) * 10;
			//System.out.println(sum);
		}
		System.out.println(sum);
	}
}
		
		
		
		

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		 int N = sc.nextInt();
	     double sum = 0;
	     Integer A[] = new Integer[N];
			for (int i=0; i<N; i++) {
				A[i] = sc.nextInt();
				sum += 1.0 / A[i];
			}
			
		 System.out.println(1.0 / sum);
	}

}

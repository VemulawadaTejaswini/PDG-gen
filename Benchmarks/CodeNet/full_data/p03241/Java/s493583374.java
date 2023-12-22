
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		
		int tmp = Integer.MAX_VALUE;
		for(int A=1;A*A<M;A++) {
			if(M%A!=0)continue;
			int B=M/A;
			if(A>=N)tmp = Math.min(A, tmp);
			if(B>=N)tmp = Math.min(B, tmp);
		}
		
		System.out.println(M/tmp);
	}
	
}


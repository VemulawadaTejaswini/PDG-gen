import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N = keyboard.nextInt();
		int[][]A = new int[N][2];
		
		for(int i=0; i<N; i++) {
			A[i][0] = i+1;
			A[i][1] = keyboard.nextInt();
		}
		
		boolean flag = true;
		for(int j=0; j<N; j++) {
			int bai = N/A[j][0];
			if(bai*A[j][1]%2 != A[j][1]) {
				flag = false;
			}
		}
		
		if(flag) {
			int print = 0;
			for(int k=0; k<N; k++) {
				if(A[k][1] ==1) {
					System.out.println(A[k][0]);
					System.out.println(1);
					print = 1;
					break;
				}
			}
			if(print == 0) {
			System.out.println(0);
			}
		}else{
			System.out.println(-1);
		}
		keyboard.close();	
	}
}

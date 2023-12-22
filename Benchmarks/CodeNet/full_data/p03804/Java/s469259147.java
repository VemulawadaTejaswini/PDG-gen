import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt();
		String A[] = new String[N];
		String B[] = new String[M];
		int A_index = 0;
		boolean flag = false;
		
		for(int i=0;i<N;i++){
			A[i] = scan.next();
		}
		
		for(int i=0;i<M;i++){
			B[i] = scan.next();
		}
		
		for(int i=1;i<M;i++){
			if(A[i].indexOf(B[i]) != -1){
				A_index = A[i].indexOf(B[i]);
				if(A[i-1].indexOf(B[i-1], A_index) == A_index){
					flag = true;
					break;
				}
			}
		}

		if(flag){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
	}

}

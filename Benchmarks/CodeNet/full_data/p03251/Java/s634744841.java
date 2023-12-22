import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		boolean flag = false;
		int[] A = new int[N];
		int[] B = new int[M];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		for(int i=0; i<M; i++) {
			B[i] = sc.nextInt();
		}
		for(int i=X+1; i<=Y; i++) {
			for(int j=0; j<N; j++) {
				if(!(i>A[j])) {
					break;
				}
			}
			for(int j=0; j<M; j++) {
				if(!(i<=B[j])) {
					break;
				}
			}
			flag = true;
			break;
		}
		
		
		
		if(flag==false) {
			System.out.println("War");
		}
		else {
			System.out.println("No War");
		}
	}

}

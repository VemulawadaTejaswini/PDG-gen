import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long H[] = new long[N];
		int A[] = new int[N];
		for(int i = 0 ; i < N ; ++i){
			A[i] = sc.nextInt();
			A[i] = A[i] - 1;
			H[A[i]]++;
		}
		long T = 0;
		for(long h : H){
			T += h * (h - 1) / 2;
		}
		
		for(int i = 0 ; i < N ; ++i){
			int a = A[i];
			if(H[a] == 1){
				System.out.println(T);
			}else{
				long h = H[a];
				long h1 = h * (h - 1) / 2;
				long h2 = (h - 1) * (h - 2) / 2;
				System.out.println(T - h1 + h2);				
			}
		}
	}
}

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int  answer = 0;
		String[] A = new String[N];
		String[] B = new String[N];
		for(int i = 0;i < N;i++){
			A[i] = sc.next();
		}
		for(int i = 0;i < M;i++){
			B[i] = sc.next();
		}
		for(int i = 0;i < N-M+1;i++){
			for(int j = 0;j < N-M+1;j++){
				for(int k = 0;k < M;k++){
					for(int l = 0;l < M;l++){
						if(A[i+k].charAt(j+l)!=B[k].charAt(l)){
							answer = 0;
							break;
						}
					}
				}
				if(answer == 1){
					System.out.println("Yes");
					System.exit(0);
				}
				answer = 1;
			}
		}
		System.out.println("No");
	}
}

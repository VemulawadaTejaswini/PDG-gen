import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	
	public Main(){
		new Aoj1130().doIt();
	}
	class Aoj1130{
		void doIt(){
			int N = sc.nextInt();
			int[] A = new int[N];
			int[] B = new int[N];
			int cnt = 0;
			for(int i = 0; i < N; i++){
				A[i] = sc.nextInt();
				if(A[i] % 2 == 0){
					B[i] = 1;
				}else{
					B[i] = 0;
				}
			}
			
			while(true){
				for(int i = 0; i < N; i++){
					if(B[i] == 1){
						for(int k = i + 1; k < N; k++){
							if(B[k] == 1){
								A[i] = A[i] + A[k];
								A[k] = -1;
								if(A[i] % 2 == 0){
									B[i] = 1;
								}else{
									B[i] = 0;
								}
							}
						}
					}
					if(B[i] == 0){
						for(int k = i + 1; k < N; k++){
							if(B[k] == 0){
								A[i] = A[i] + A[k];
								A[k] = -1;
								if(A[i] % 2 == 0){
									B[i] = 1;
									B[k] = -1;
								}else{
									B[i] = 0;
									B[k] = -1;
								}
							}
						}
					}
					
					//for(int k = 0; k < N; k++){
					//	System.out.print(A[k] + " ");
					//}
					//System.out.println("");
				}
				
				cnt = 0;
				for(int k = 0; k < N; k++){
					if(A[k] != -1)cnt++;
				}
				if (cnt >= 2) break;
			}
			if(cnt >= (N-1))System.out.println("YES");
			else System.out.println("NO");
		}
	}
}

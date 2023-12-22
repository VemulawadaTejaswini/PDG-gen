public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N  = keyboard.nextInt();
		int[] A = new int[N+1];
		int[] B = new int[N];
		
		for(int i=0; i<N+1; i++) {
			 A[i] = keyboard.nextInt();
		}
		for(int j=0; j<N; j++) {
			 B[j] = keyboard.nextInt();
		}
		
		int count = 0;
		for(int k= 0; k<N; k++) {
			if(A[k] <= B[k]) {
				count += A[k];
				if(B[k]-A[k] <= A[k+1]) {
					A[k+1] -= B[k]-A[k];
					count += B[k]-A[k];
				}else if(B[k]-A[k] >= A[k+1]) {
					count += A[k+1];
					A[k+1] = 0;
				}
			}else{
				count += B[k];
			}
		}

		System.out.println(count);
		keyboard.close();	
	}
}

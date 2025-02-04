import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		int sum = 0;
		for(int i=0;i<N;i++){
			A[i] = Integer.parseInt(br.readLine());
			if(A[i]>=2){
				sum += A[i]/2;
				A[i] = A[i]%2;
			}
		}
		
		for(int i=0;i<N-1;i++){
			if(A[i]>0 && A[i+1]>0){
				sum += Math.min(A[i], A[i+1]);
				A[i] = A[i+1] -= Math.min(A[i], A[i+1]);
			}
		}
		
		System.out.println(sum);
	}

}

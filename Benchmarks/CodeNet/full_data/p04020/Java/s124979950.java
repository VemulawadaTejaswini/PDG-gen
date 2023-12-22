import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		int sum = 0;
		int temp = 0;
		for(int i=0;i<N;i++){
			A[i] = Integer.parseInt(br.readLine());
			if(A[i]>=2){
				sum += A[i]/2;
				A[i] = A[i]%2;
			}
			if(i > 0){
				if(A[i-1]>0 && A[i]>0){
					temp = Math.min(A[i-1], A[i]);
					sum += temp;
					A[i] -= temp;
					A[i-1] -= temp;
				}
			}
		}
		System.out.println(sum);
	}
}

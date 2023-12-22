import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] A = new int[N];
		for(int i=0;i<N;i++){
			A[i] = scan.nextInt();
		}

		Arrays.sort(A);
		int Max = A[N-1];
		int count=1;
		for(int i=N-2;i>0;i--){
			if(A[i]==Max){
				count++;
			}else{
				break;
			}
		}
		if(count>1){
			System.out.println(N+count);
		}else{
			System.out.println(N-1);
		}
	}
}
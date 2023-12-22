import java.util.*;
public class Main{
	public static void main(String args[]){
		
		Scanner ob = new Scanner(System.in);
		int N = ob.nextInt();
		int M = ob.nextInt();
		int R = 0;

		int[] array = new int[M];
		for(int i = 0; i < M; i++){
			array[i] = ob.nextInt();
		}

		for(int j = 0; j < M; j++){
			R += array[j]; 
		}

		if((N - R) < 0){
			System.out.println(-1);
		}
		else{
			System.out.println(N - R);
		}
	}
}

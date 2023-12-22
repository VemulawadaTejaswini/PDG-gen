import java.time.Instant;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] L = new int[M];
		int[] R = new int[M];
		for(int i=0; i<M; i++){
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
		}

		int min=0;
		int max=N;
		for(int i=0; i<M; i++){
			if(min<=L[i]){
				min=L[i];
			}

			if(max>=R[i]){
				max=R[i];
			}
		}

		if(max>min){
			System.out.println(max-min+1);
		}else{
			System.out.println(0);
		}


	}
}
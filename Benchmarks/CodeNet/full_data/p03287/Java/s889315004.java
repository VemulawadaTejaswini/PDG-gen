import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//D
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0 ; i < N ; i++){
			A[i] = sc.nextInt();
		}
		ArrayList<Integer> kouho = new ArrayList<>();
		long ans = 0;
		long tmp = 0;
		for(int j = 0 ; j < N ; j++){
			for(int k = j ; k < N ;k++){
				tmp += A[k];
				if(tmp % M == 0){
					ans++;
				}
			}
			tmp = 0;
		}
		System.out.println(ans);

	}
}
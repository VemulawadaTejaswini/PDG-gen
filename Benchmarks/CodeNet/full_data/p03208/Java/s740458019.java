import java.util.Arrays;
import java.util.Scanner;


public class Main {
	static int N,K;
	static int[] trees;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 N = sc.nextInt();
		 K = sc.nextInt();
		 trees = new int[N];

		 for(int i = 0 ; i < N ; i++){
			 trees[i] = sc.nextInt();
			 }
		 sc.close();

		 Arrays.sort(trees);
		 int current = 100000001 ;
		 for(int i = 0 ; i < N-K+1 ; i++){
			 if(current > trees[i+K-1]-trees[i]){
				 current = trees[i+K-1]-trees[i];
			 }
		 }
	System.out.println(current);
	}
}
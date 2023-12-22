import java.util.Scanner;

/**
 * https://abc064.contest.atcoder.jp/tasks/abc064_c
 */
public class Main {

	public static void main(String[] args) {
		
		int[] kind = new int[9];
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0; i<N; i++){
			int c = sc.nextInt();
			kind[Math.min(8,c/400)]++;
		}
		sc.close();
		
		int min = 0;
		for(int i=0; i<8; i++){
			if(kind[i]>0){
				min++;
			}
		}		
		int max = Math.min(9, min+kind[8]);
		System.out.println(String.format("%d %d", min, max));

	}

}
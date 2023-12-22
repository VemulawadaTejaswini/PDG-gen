import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int l;
		for(l=1; l<N; l++){
			N -= l;
		}
		if(N != l){
			System.out.println("No");
			System.out.flush();
			return;
		}
		System.out.println("Yes");
		int[][] answer = new int[l+1][l];
		int Index = 1;
		for(int i=0; i<=l; i++){
			int j=0;
			for(; j<i; j++){
				System.out.printf("%d ", answer[i][j]=answer[j][i-1]);
			}
			for(; j<l; j++){
				System.out.printf("%d ", answer[i][j]=Index++);
			}
			System.out.printf("\n");
		}
		System.out.flush();
		return;
	}

}

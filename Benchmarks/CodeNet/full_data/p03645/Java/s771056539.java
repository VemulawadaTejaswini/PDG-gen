import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		boolean[] is1 = new boolean[N];
		boolean[] isN = new boolean[N];
		for(int i = 0; i < M; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a == 1) is1[b] = true;
			if(b == 1) is1[a] = true;
			if(a == N) isN[b] = true;
			if(b == N) isN[a] = true;
		}
		int i;
		for(i = 2; i < N; i++){
			if(is1[i]){
				if(isN[i]){
					System.out.println("POSSIBLE");
					break;
				}
			}
		}
		if(i == N){
			System.out.println("IMPOSSIBLE");
		}
	}
}
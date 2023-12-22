import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] P = new int[N];
		int ans = 0;
		for(int i = 0;i < N;i++){
			P[i] = sc.nextInt();
		}
		boolean[] list = new boolean[N];
		Arrays.fill(list,true);
		for(int i = 0;i < N - 1;i++){
			for(int j = 1;j < N;j++){
				if(P[j] > P[i]){
					list[i] = false;
				}else{
					list[j] = false;
				}
			}
			if(list[i]){
				ans++;
			}
		}
		System.out.println(ans);
	}
}
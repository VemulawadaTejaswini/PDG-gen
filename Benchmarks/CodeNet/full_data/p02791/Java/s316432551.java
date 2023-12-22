import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] P = new int[N];
		for(int i = 0;i < N;i++){
			P[i] = sc.nextInt();
		}
		boolean[] list = new boolean[N];
		Arrays.fill(list,true);
		for(int i = 0;i < N - 1;i++){
			flg = true;
			for(int j = 1;j < N;j++){
				if(P[j] > P[i]){
					flg = false;
				}else{
					list[j] = false;
				}
			}
			if(flg){
				list[i] = (true && list[i]);
			}
		}
		System.out.println(ans);
	}
}
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		int N = sn.nextInt();
		int A = sn.nextInt();
		int x[] = new int[52];
		int ans = 0;
		for(int i = 0;i < N;++i){
			x[i] = sn.nextInt();
		}
		for(int i = 1; i < (1 << N); ++i){
			double sum = 0;
			double c = 0;
			for(int j = 0; j < N; ++j){
				if((i & (1 << j)) != 0){
					sum += x[j];
					++c;
				}
			}
			if(sum/c == A){
				++ans;
			}
		}
		System.out.println(ans);
	}
}

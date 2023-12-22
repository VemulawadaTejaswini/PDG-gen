import java.util.*;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int [] x = new int[N];
		
		int [] count = new int[N];
		Arrays.fill(count, 0);

		for(int i=0;i<N;i++){
			++count[sc.nextInt()-1];
		}
		Arrays.sort(count);
		int i;
		for(i=0;i<N;i++){
			if(count[i]!=0){
				break;
			}
		}
		int ans =0;
		for(int j=i;j<N-K;j++){
			ans += count[j];
		}
		System.out.print(ans);
		

	}
}
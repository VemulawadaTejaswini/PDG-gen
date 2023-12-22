import java.*;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	static int N;
	static int K;
	static int List[];
	static int[] status;
	static int Answer,Min;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss = new Scanner(System.in);
		N = ss.nextInt();
		K = ss.nextInt();
		List = new int[N];
		for (int i = 0; i < N; i++) {
			List[i] = ss.nextInt();
		}
		int flag=0;
		for (int i = 0; i < N-1; i++) {
			if(List[i]<0 && List[i+1]<0)continue;
			if(List[i]==0) {
				flag = i;
				K--;
				break;
			}
			if(List[i]<0 && List[i+1]>0) {
				flag =i+1;
			}	
		}
		Answer = Integer.MAX_VALUE;
		if(List[0]>0)Answer=List[K-1];
		if(List[N-1]<0)Answer=List[N-K];
		if(flag==0&&N==1)Answer=1;
		if(flag>0 && flag<N-1) {
			int cnt=0;
			for (int i = 0; i <= 1; i++) {
				if(i==0) {
					for (int j = flag-1; j>=flag-K; j--) {
						if(j<0)break;
						if(K-1+j>=N)continue;
						cnt=Math.abs(List[j])*2+List[K-1+j];
						if(cnt<Answer)Answer=cnt;
					}
					
				}
				if(i==1) {
					for (int j = flag; j< flag+K; j++) {
						if(j>=N)break;
						if(j-K+1<0)continue;
						cnt=List[j]*2+Math.abs(List[j-K+1]);
						if(cnt<Answer)Answer=cnt;
					}
				}

			}
		}
		
		System.out.println(Answer);
		
	
	
	}

}

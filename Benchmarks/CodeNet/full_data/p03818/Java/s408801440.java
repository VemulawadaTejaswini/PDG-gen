import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] cnt = new int[10000];
		for(int i=0; i<N; i++)
			cnt[sc.nextInt()-1]++;
		int single = 0;
		int multi = 0;
		for(int i=0; i<10000; i++) {
			if(cnt[i]>0) {
				if(cnt[i]%2==0)
					multi++;
				else
					single++;
			}
		}
		
		System.out.println(single + multi - (multi%2));
		sc.close();
	}
}

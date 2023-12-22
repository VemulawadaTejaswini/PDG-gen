import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt(), G = sc.nextInt();
		int nums[][] = new int[D][2];
		for(int i=0;i<D;i++) {
			int p = sc.nextInt(), c = sc.nextInt();
			nums[i][0] = p; nums[i][1]=c;
		}
		sc.close();
		
		int ans = Integer.MAX_VALUE / 2;
		//bit全探索
		for(int bit = 0; bit<(1<<D); bit++) {
			int score = 0;
			int cnt = 0;
			for(int i=0;i<D;i++) {
				if((bit>>i & 1)==1) {
					int num = nums[i][0] , bonus = nums[i][1];
					cnt += num;
					score += (i+1)*100 * num; 
					score += bonus; //bonus
				}
			}
			
			int maxD = 0;
			for(int j=D-1;j>=0;j--) {
				if((bit>>j & 1)!=1 && nums[j][0]>0) {
					maxD = j;
					break;
				}
			}
			int num = nums[maxD][0];
			while(G>score) {
				score += (maxD + 1)*100;
				num --;
				cnt ++ ;
				if(num == 0) break;
			}
			if(G>score)continue;
			ans = Math.min(ans, cnt);
		}
		System.out.println(ans);
	}
}
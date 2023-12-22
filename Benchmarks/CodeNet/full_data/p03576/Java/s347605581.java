import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[][] p = new int[n][2];
		for(int i=0;i<n;i++){
			p[i][0] = sc.nextInt();
			p[i][1] = sc.nextInt();
		}
		
		long min = Long.MAX_VALUE;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				for(int r=0;r<n;r++){
					for(int s=r+1;s<n;s++){
						int left = p[i][0], right = p[j][0];
						int top = p[r][1], button = p[s][1];
						
						if(left>right){
							int tmp = left;
							left = right;
							right = tmp;
						}
						if(top<button){
							int tmp = top;
							top = button;
							button = tmp;
						}
						
						int cnt = 0;
						for(int t=0;t<n;t++){
							if(left<=p[t][0] && p[t][0]<=right && button<=p[t][1] && p[t][1]<=top)
								cnt++;
						}
						
						if(cnt>=k){
							long area = (long)(right-left)*(top-button);
							if(area<min)
								min = area;
						}
					}
				}
			}
		}
		System.out.println(min);
	}
}

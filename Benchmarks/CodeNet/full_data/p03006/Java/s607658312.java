import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] xy = new int[N][2];
		for(int i = 0; i < N; i++) {
			xy[i][0] = sc.nextInt();
			xy[i][1] = sc.nextInt();
		}
		Arrays.sort(xy, (x,y) -> x[0] == y[0] ? x[1]-y[1] : x[0]-y[0]);
		List<Integer> pkouho = new ArrayList<>();
		List<Integer> qkouho = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			for(int j = i; j < N; j++) {
				if(!pkouho.contains(Math.abs(xy[i][0] - xy[j][0])))
					pkouho.add(Math.abs(xy[i][0] - xy[j][0]));
				if(!qkouho.contains(Math.abs(xy[i][1] - xy[j][1])))
					qkouho.add(Math.abs(xy[i][1] - xy[j][1]));
			}
		}
		int ans = N;
		for(int i = 0; i < pkouho.size(); i++) {
			for(int j = 0; j < qkouho.size(); j++) {
				LOOP:for(int k = 0; k < N-1; k++) {
					for(int l = k+1; l < N; l++) {
						if(xy[l][0] - xy[k][0] == pkouho.get(i) && xy[l][1] - xy[k][1] == qkouho.get(j)){
						ans--;
                        break LOOP;
                        }
					}
				}
			}
		}
		System.out.println(ans);
	}

}
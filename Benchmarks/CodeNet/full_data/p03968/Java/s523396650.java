import java.util.*;

public class Main {
	static final long MOD = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		HashMap<Long, Integer> num = new HashMap<>();
		int[][] c = new int[N][4];
		for(int i=0; i<N; i++) {
			for(int j=0; j<4; j++)
				c[i][j] = sc.nextInt();
			Long code = getCode(c[i]);
			if(num.containsKey(code))
				num.put(code, num.get(code)+1);
			else
				num.put(code, 1);
		}
		
		long ans = 0;
		int[][] side = new int[4][4];
		long[] sideCode = new long[4];

		for(int i=0; i<N; i++) {
			Long bottomCode = getCode(c[i]);
			num.put(bottomCode, num.get(bottomCode)-1);
			
			for(int j=0; j<4; j++) {
				side[j][0] = c[i][j];
				side[j][3] = c[i][(j+1)%4];
			}
			for(int j=i+1; j<N; j++) {
				long topCode = getCode(c[j]);
				for(int d=0; d<4; d++) {
					for(int k=0; k<4; k++) {
						side[k][2] = c[j][(d+k)%4];
						side[k][1] = c[j][(d+k+1)%4];
						sideCode[k] = getCode(side[k]);
					}
					Arrays.sort(sideCode);
					
					long temp = 1;
					int anc=0;
					for(int k=0; k<4; k++) {
						if(k==3 || sideCode[k]!=sideCode[k+1]) {
							Integer total = num.get(sideCode[k]);
							if(total==null)
								continue;
							if(sideCode[k]==topCode)
								total--;
							for(int l=0; l<k-anc+1; l++)
								temp *= total-l;
							anc=k+1;
						}
					}
					ans += temp;
				}
			}
		}
		
		System.out.println(ans);
		sc.close();
	}
	
	static long getCode(int[] c) {
		int idx = 0;
		for(int i=1; i<4; i++)
			if(c[i]<c[idx])
				idx=i;
		long code = 0;
		for(int i=0; i<4; i++)
			code |= c[(i+idx)%4]<<10;
		return code;
	}
}

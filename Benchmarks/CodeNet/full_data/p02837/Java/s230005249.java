import java.util.*;
 
public class Main { 
	public static int[][][] syougens;
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		syougens = new int[n][][];
		for(int i=0; i<n; i++){
			int a = sc.nextInt();
			int[][] syougen = new int[a][2];
			for(int j=0; j<a; j++){
				syougen[j][0] = sc.nextInt();
				syougen[j][1] = sc.nextInt();
				syougens[i] = syougen;
			}
		}
		bitSearch(n);
	}

	static void bitSearch(int n) {
		int ans = 0;
		for (int i = 0; i < (Math.pow(2, n)); i++) {
			boolean[] flags = new boolean[n];
			int count = n;
			for (int j = 0; j < n; j++) {
				if ((1 & i >> j) == 1) {
					flags[j] = true;
				} else {
					flags[j] = false;
					count--;
				}
			}
			boolean flag = true;
			for(int ss = 0; ss<syougens.length; ss++){
				for(int s=0; s<syougens[ss].length; s++){
					if(flags[ss]){
						int target = syougens[ss][s][0];
						int syougen = syougens[ss][s][1];
						if(!flags[target-1] && syougen == 1){
							flag = false;
						} else if(flags[target-1] && syougen == 0){
							flag = false;
						}
					}
				}
			}
			if(flag) ans = Math.max(ans, count);
		}
		System.out.println(ans);
	}
}

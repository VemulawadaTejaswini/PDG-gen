public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a,b;
		a = s.next();
		b = s.next();
		StringBuilder sb = new StringBuilder("");
		int [][] dp = new int[a.length()+1][b.length()+1];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[i].length;j++) {
				if(i==0||j==0) {
					dp[i][j] = 0;
				}
				else if(a.charAt(i-1)==b.charAt(j-1)) {
					dp[i][j] = 1 + dp[i-1][j-1];
				}
				else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		int index = dp[a.length()][b.length()];
		int x = a.length();
		int y = b.length();
		while(index>0) {
			if(dp[x][y]-1==dp[x-1][y-1]) {
				sb.insert(0,a.charAt(x-1));
				index--;
				x--; 
				y--;
			}
			else if(dp[x][y] == dp[x-1][y]) {
				x--;
			}
			else if(dp[x][y] == dp[x][y-1]) {
				y--;
			}
			
		}
//		for(int i=0;i<dp.length;i++) {
//			for(int j=0;j<dp[i].length;j++) {
//				System.out.print(dp[i][j] + " ");
//			}
//			System.out.println();
//		}
//		System.out.println(dp[a.length()][b.length()]);
		System.out.println(sb.toString());

	}
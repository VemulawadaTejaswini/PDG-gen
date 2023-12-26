public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String[] line = br.readLine().split(" ");
	    int n = Integer.parseInt(line[0]);
	    int m = Integer.parseInt(line[1]);
	    int[][] a = new int[n][m];
	    for (int i = 0; i < n; i++) {
	    	line = br.readLine().split(" ");
	    	for (int j = 0; j < m; j++) {
		    	a[i][j] = Integer.parseInt(line[j]);
	    	}
	    }
	    int[][] b = new int[m][1];
	    for (int i = 0; i < m; i++) {
	    	b[i][0] = Integer.parseInt(br.readLine());
	    }
	    int[][] ans = new int[n][1];
	    for (int i = 0; i < n; i++) {
	    	for (int j = 0; j < m; j++) {
	    		ans[i][0] += (a[i][j] * b[j][0]);
	    	}
	    }
	    for (int i = 0; i < ans.length; i++) {
	    	System.out.println(ans[i][0]);
	    }
	}
}

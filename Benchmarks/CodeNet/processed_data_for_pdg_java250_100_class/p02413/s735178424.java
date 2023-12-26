public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String[] line = br.readLine().split(" ");
	    int r = Integer.parseInt(line[0]);
	    int c = Integer.parseInt(line[1]);
	    int[][] matrix = new int[r + 1][c + 1];
	    for (int i = 0; i < r; i++) {
	    	line = br.readLine().split(" ");
	    	for (int j = 0; j < line.length; j++) {
		    	matrix[i][j] = Integer.parseInt(line[j]);
		    	matrix[i][c] += matrix[i][j];
		    	matrix[r][j] += matrix[i][j];
		    	if (j == line.length - 1) {
			    	matrix[r][c] += matrix[i][c];
		    	}
	    	}
	    }
	    for (int i = 0; i < r + 1; i++) {
		    StringBuilder sb = new StringBuilder();
	    	for (int j = 0; j < c + 1; j++) {
	    		sb.append(matrix[i][j]);
	    		sb.append(" ");
	    	}
	    	System.out.println(sb.toString().substring(0, sb.toString().length() - 1));
	    }
	}
}

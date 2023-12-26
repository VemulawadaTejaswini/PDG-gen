public class Main {
    public static void main(String[] args) {
	try {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    List<String> lines = new ArrayList<String>();
	    String line = "";
	    while((line = br.readLine()) != null){
		lines.add(line);
	    }
	    br.close();
	    Integer n, m, l = 0;
	    n = Integer.parseInt(lines.get(0).split(" ")[0]);
	    m = Integer.parseInt(lines.get(0).split(" ")[1]);
	    l = Integer.parseInt(lines.get(0).split(" ")[2]);
	    Long[][] A = new Long[n][m];
	    Long[][] b = new Long[m][l];
	    Long[][] C = new Long[n][l];
	    for (int i=1; i<n+1; i++) {
		String[] elements = lines.get(i).split(" ");
		for (int j=0; j<m; j++) {
		    A[i-1][j] = Long.parseLong(elements[j]);
		}
	    }
	    for (int i=n+1; i<n+m+1; i++) {
		String[] elements = lines.get(i).split(" ");
		for (int j=0; j<l; j++) {
		    b[i-n-1][j] = Long.parseLong(elements[j]);
		}
	    }
	    for (int i=0; i<n; i++) {
		for (int j=0; j<l; j++) {
		    C[i][j] = 0L;
		}
	    }
	    for (int i=0; i<n; i++) {
		for (int j=0; j<m; j++) {
		    for (int k=0; k<l; k++) {
			Long x = A[i][j] * b[j][k];
			C[i][k] += x;
		    }
		}
	    }
	    for (int i=0; i<n; i++) {
		for (int j=0; j<l; j++) {
		    if (j == l-1) {
			System.out.println(C[i][j]);
		    } else {
			System.out.print(C[i][j] + " ");
		    }
		}
	    }
	    System.exit(0);
	} catch (Exception e) {
	    System.out.println(e.getMessage());
	    System.out.println(Arrays.toString(e.getStackTrace()));
	    System.exit(0);
	}
    }
}

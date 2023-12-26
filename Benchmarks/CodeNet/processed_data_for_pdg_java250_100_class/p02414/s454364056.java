class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String scan_str = scan.nextLine();
		String[] first_str = scan_str.split(" ");
		int n = Integer.parseInt(first_str[0]);
		int m = Integer.parseInt(first_str[1]);
		int l = Integer.parseInt(first_str[2]);
		String[] m_count = new String[m];
		String[] l_count = new String[l];
		long[][] A = new long[n][m];
		long[][] B = new long[m][l];
		long[][] C = new long[n][l];
		int i = 0;
		int j = 0;
		int k = 0;
		for(i=0; i<n; i++){
			scan_str = scan.nextLine();
			m_count = scan_str.split(" ");
			for(j=0; j<m; j++){
				A[i][j] = Long.parseLong(m_count[j]);
			}
		}
		for(i=0; i<m; i++){
			scan_str = scan.nextLine();
			l_count = scan_str.split(" ");
			for(j=0; j<l; j++){
				B[i][j] = Long.parseLong(l_count[j]);
			}
		}
		for(i=0; i<n; i++){
			for(j=0; j<l; j++){
				for(k=0; k<m; k++){
					C[i][j] = C[i][j] + (A[i][k] * B[k][j]);
				}
				if(j == (l-1)){
					System.out.println(C[i][j]);
				}else {
					System.out.print(C[i][j] + " ");
				}
			}
		}
	}
}

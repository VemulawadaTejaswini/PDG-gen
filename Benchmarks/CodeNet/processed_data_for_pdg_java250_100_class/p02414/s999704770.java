class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int 
			 	n,
				m,
				l;
		long[][]
				A,
				B,
				C;
		String output;
		n = Integer.parseInt(sc.next());
		m = Integer.parseInt(sc.next());
		l = Integer.parseInt(sc.next());
		A = new long[n][m];
		B = new long[m][l];
		C = new long[n][l];
		for(int i = 0;i < n;i++){
			for(int k = 0;k < m;k++){
				A[i][k] = Integer.parseInt(sc.next());
			}
		}
		for(int k = 0;k < m;k++){
			for(int j = 0;j < l;j++){
				B[k][j] = Integer.parseInt(sc.next());
			}
		}
		for(int k = 0;k < m;k++){
			for(int i = 0;i < n;i++){
				for(int j = 0;j < l;j++){
					C[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		for(int i = 0;i < n;i++){
				output = "";
				for(int j = 0;j < l;j++){
					output += C[i][j];
					if(j < l - 1)output += " ";
				}
				System.out.print(output + "\n");
		}
	}
}

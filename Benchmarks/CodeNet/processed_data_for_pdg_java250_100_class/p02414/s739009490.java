class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		int n =Integer.parseInt(line[0]);
		int m =Integer.parseInt(line[1]);
		int l =Integer.parseInt(line[2]);
		int[][] a =new int[n][m];
		int[][] b =new int[m][l];
		long[][] c =new long[n][l];
		for(int i=0;i<n;i++){
			String[] input = sc.nextLine().split(" ");
			for(int j=0;j<m;j++){
				a[i][j]=Integer.parseInt(input[j]);
			}
		}
		for(int i=0;i<m;i++){
			String[] input= sc.nextLine().split(" ");
			for(int j=0;j<l;j++){
				b[i][j]=Integer.parseInt(input[j]);
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<l;j++){
				c[i][j]=0;
				for(int k=0;k<m;k++){
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<l-1;j++){
				System.out.print(c[i][j]+" ");
			}
			System.out.println(c[i][l-1]);
		}
	}
}

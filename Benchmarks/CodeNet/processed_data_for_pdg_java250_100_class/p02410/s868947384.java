class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] line =sc.nextLine().split(" ");
		int n = Integer.parseInt(line[0]);
		int m = Integer.parseInt(line[1]);
		int[][] a = new int[n][m];
		int[] b   = new int[m];
		int[] c   = new int[n];
		for(int i=0;i<n;i++){
			String[] input=sc.nextLine().split(" ");
			for(int j=0;j<m;j++){
				a[i][j]=Integer.parseInt(input[j]);
			}
		}	
		for(int i=0;i<m;i++){
			b[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			int sum=0;
			for(int j=0;j<m;j++){
				sum=sum+a[i][j]*b[j];
			}
			c[i]=sum;
		}
		for(int i=0;i<n;i++){
			System.out.println(c[i]);
		}
	}
}

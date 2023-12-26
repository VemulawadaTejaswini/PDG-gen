class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] spl = str.split(" ");
		int n = Integer.parseInt(spl[0]);
		int m = Integer.parseInt(spl[1]);
		int i=0;
		int j=0;
		String[] input = new String[m];
		int[][] a = new int[n][m];
		int[] b = new int[m];
		int[] c = new int[n];
		for(i=0; i<n; i++){
			str = scan.nextLine();
			input = str.split(" ");
			for(j=0; j<m; j++){
				a[i][j] = Integer.parseInt(input[j]);
			}
		}
		for(i=0; i<m; i++){
			str = scan.nextLine();
			b[i] = Integer.parseInt(str);
		}
		for(i=0; i<n; i++){
			for(j=0; j<m; j++){
				c[i] = c[i] + (a[i][j] * b[j]);
			}
			System.out.println(c[i]);
		}
	}
}

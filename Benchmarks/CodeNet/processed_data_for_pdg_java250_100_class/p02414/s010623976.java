class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int m =scan.nextInt();
		int l =scan.nextInt();
		int A[][] = new int[100][100];	
		int B[][] = new int[100][100];
		long keisan = 0;
		for(int i =0; i<n; i++){	
			for(int ii=0;ii<m;ii++){
				A[i][ii] = scan.nextInt();
			}
		}
		for(int i=0;i<m;i++){	
			for(int ii=0;ii<l;ii++){
				B[i][ii] = scan.nextInt();
			}
		}
		for (int i=0; i<n; i++){	
			for(int ii=0; ii<l; ii++){
				keisan = 0;
				for(int iii=0; iii<m; iii++){
					keisan += A[i][iii] * B[iii][ii];
				}
				System.out.print(keisan);
				if(ii < l-1){
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}

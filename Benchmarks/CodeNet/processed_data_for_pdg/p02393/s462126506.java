class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] k = new int[4];					
		int i,j;
		for(i = 0; i < 3; i++) {
			k[i] = scan.nextInt();
		}
		int n = 3;						
		int hozon;						
		for(i = 1; i < n; i++){
			k[n] = k[i];
			for(j = i-1; j >= 0 && k[j] > k[n]; j--){
				k[j+1] = k[j];
			}
			if(j != i-1){
				k[j+1] = k[n];
			}
		}
		for(i = 0; i < n; i++){
			System.out.print(k[i]);
			if(i < n-1) System.out.print(" ");
		}
		System.out.println("");
	}
}

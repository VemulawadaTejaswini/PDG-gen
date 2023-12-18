class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
   		int i, j;
		int n = 3;
    	int[] a = new int[4];
    	for(i = 0; i < n; i++) a[i] = sc.nextInt();
		for(i = 1; i < n; i++){
			a[3] = a[i];
			for(j = i - 1; j >= 0 && a[j] > a[3]; j--){
				a[j + 1]  = a[j];
			}
				if(j != i - 1){
					a[j + 1] = a[3];
				}
		}
		System.out.println(a[0] + " " + a[1] + " " + a[2]);
	}
}

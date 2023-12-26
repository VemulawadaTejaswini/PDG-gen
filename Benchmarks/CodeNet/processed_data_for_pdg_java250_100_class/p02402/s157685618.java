class Main {
	public static void main(String[] args) {
		Scanner as = new Scanner(System.in);
		int n=as.nextInt();
		long tr,min,max,sum;
		int j = 0,k = 0;
		long jug[] = new long[n];
		jug[0]=as.nextInt();
		max=jug[0];
		min=jug[0];
		sum=jug[0];
		for(int i=1;i<n;i++){
			jug[i]=as.nextInt();
			sum=sum+jug[i];
		}
		while(j!=1){
			j=1;
			for(k = 0;k<n-1;k++){
				if(jug[k]>jug[k+1]){
					tr=jug[k];
					jug[k]=jug[k+1];
					jug[k+1]=tr;
					j=0;
				}
			}
		}
		System.out.println(jug[0]+" "+jug[k]+" "+sum);
	}
}

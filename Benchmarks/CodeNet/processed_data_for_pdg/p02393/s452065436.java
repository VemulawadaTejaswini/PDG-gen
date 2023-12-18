class Main{
    public static void main(String[] args){
        int[] n={0,0,0};
		int ex;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++){
			n[i]=sc.nextInt();
		}
		for(int i=0;i<2;i++){
			for(int j=i+1;j<3;j++){
				if(n[i]>n[j]){
					ex=n[i];
					n[i]=n[j];
					n[j]=ex;
				}
			}
		}
		System.out.println(n[0]+" "+n[1]+" "+n[2]);
    }
}

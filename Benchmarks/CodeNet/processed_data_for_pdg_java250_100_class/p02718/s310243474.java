class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for(int i=0; i<n; i++){
        	arr[i]=sc.nextInt();
        	sum+=arr[i];
        }
        float check=(float)sum/(4*m);
        int count=0;
        for(int i=0; i<n; i++){
        	if(arr[i]>=check)
        		count++;	
        }
        if(count>=m)
        	System.out.println("Yes");
        else
        	System.out.println("No");
		sc.close();
	}
}

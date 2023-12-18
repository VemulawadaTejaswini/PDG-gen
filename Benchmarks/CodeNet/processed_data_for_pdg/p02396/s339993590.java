class Main{
    public static void main(String[] args){
		int x;
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=10000;i++){
			x=sc.nextInt();
			if(x==0)break;
			System.out.println("Case "+i+": "+x);
		}
    }
}

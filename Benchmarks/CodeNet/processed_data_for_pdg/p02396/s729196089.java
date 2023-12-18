class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		for(int i=1;;i++){
			int x=stdIn.nextInt();
			if(x<1)break;
			System.out.println("Case "+i+": "+x);
		}
	}
}

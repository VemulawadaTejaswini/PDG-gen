class Main {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int i=1;
		while(true){
			int x=cin.nextInt();
			if(x==0)break;
			System.out.println("Case "+i+": "+x);
			i++;
		}
	}
}

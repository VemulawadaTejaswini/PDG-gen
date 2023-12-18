class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int d = sc.nextInt();
		if(c==d){
			System.out.println("a == b");
		}else if(c<d){
			System.out.println("a < b");
		}else{
			System.out.println("a > b");
		}
	}
}

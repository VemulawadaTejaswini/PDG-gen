class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt(),   b= sc.nextInt();
		String s = a<b? "<":
				   a>b? ">": "==";
		System.out.println("a " + s + " b");
	}
}

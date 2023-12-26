class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			
		String n = sc.next();
		int y = Integer.parseInt(n.substring(0,4));
		int m = Integer.parseInt(n.substring(5,7));
		int d = Integer.parseInt(n.substring(8));
		if(y >= 2019 && m > 4){
			System.out.println("TBD");
		}else{
			System.out.println("Heisei");
		}
	}
}

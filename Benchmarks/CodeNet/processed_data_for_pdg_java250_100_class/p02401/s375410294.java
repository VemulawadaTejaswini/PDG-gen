class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int inta = sc.nextInt();
			String strop =  sc.next();
			int intb = sc.nextInt();
			if (strop.equals("?")){
				break;
			}else if (strop.equals("+")) {
				System.out.println(inta + intb);
			}else if (strop.equals("-")) {
				System.out.println(inta - intb);
			}else if (strop.equals("*")) {
				System.out.println(inta * intb);
			}else if (strop.equals("/")) {
				System.out.println(inta / intb);
			}
		}
	}
}

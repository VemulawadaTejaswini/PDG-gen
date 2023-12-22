class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String first = str.substring(0, 2);
		String second = str.substring(2, 4);
		
		if(first.matches("[1-12]") && second.matches("[1-12]")) System.out.println("AMBIGUOUS");
		else if(second.matches("[1-12]")) System.out.println("YYMM");
		else if(first.matches("[1-12]")) System.out.println("MMYY");
		else System.out.println("NA");
		//System.out.println(second);
	}
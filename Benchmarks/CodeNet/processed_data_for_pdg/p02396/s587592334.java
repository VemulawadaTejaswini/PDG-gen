class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int num = 1;; num++ ){
			int x = scanner.nextInt();
			if (x == 0) {
			    break;
			}		
		    System.out.println("Case "+ num +": "+x);
	    }
	}	
}

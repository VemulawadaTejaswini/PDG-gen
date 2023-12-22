	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		for (int i = 0; i< args[0].length(); i++){
			x += (args[0].charAt(i) - '0');
		}
		
		int y = Integer.parseInt(args[0]);
		
		if ( y%x == 0 ) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

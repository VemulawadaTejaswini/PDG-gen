class Main {
  public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	boolean Judge = true;
  	String end = "-";
  	String work;
  	while( Judge ){
		String deck = scanner.next();		
  		if( deck.equals(end) ){
  			Judge = false;
  			break;
  		}
		int shuffle = scanner.nextInt();	
  		for( int i = 0; i < shuffle ; i ++ ) {
			int num = scanner.nextInt();	
			String substr = deck.substring(0, num);
			work = deck.replaceFirst(substr, "");
			deck = work.concat(substr);
  		}
  		System.out.println(deck);
  	}
	scanner.close();
  }
}

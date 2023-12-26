class Main {
  public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	String search = scanner.nextLine();	
	boolean Judge = true;
  	int count = 0;
  	String end = "END_OF_TEXT";
  	while( Judge ){
		String word = scanner.next();	
  		int result = word.lastIndexOf(end);	
  		if( result != -1 ){
  			Judge = false;
  		}else{
  			word = word.toLowerCase(); 		
  		}
  		if( word.equals(search) ) {
  			count++;
  		}
  	}
	System.out.println(count);
	scanner.close();
  }
}

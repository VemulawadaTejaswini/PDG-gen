class Main {
  public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	String search = scanner.nextLine();	
	boolean Judge = true;
  	int count = 0;
  	int count2 = 0;
  	int wordlengh,minlength;
  	String end = "END_OF_TEXT";
  	String work;
  	while( Judge ){
		String word = scanner.next();	
  		int result = word.lastIndexOf(end);	
  		if( result != -1 ){
  			Judge = false;
  		}else{
  			word = word.toLowerCase(); 		
  		}
  		if( word.equals(search) ) {
  			count2++;
  		}
  		wordlengh = word.length();			
		work = word.replaceAll(search, ""); 
		minlength = work.length();			
		count += ( wordlengh - minlength )/(search.length());	
  	}
	System.out.println(count2);
	scanner.close();
  }
}

class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
       String str = br.readLine();  
       int r = Integer.parseInt(str); 
  	   int i = 1;
  	while ( r != 0 ) {  
  		System.out.println(  "Case " + i + ": " + r);
 		i++;
        str = br.readLine();  
        r = Integer.parseInt(str); 
  	}	
  	}
  }

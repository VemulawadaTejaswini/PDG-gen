class Main{
  public static void main(String args[]) throws IOException{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   String[] original =  br.readLine().split("");
   String[] serch =  br.readLine().split("");
   int flag = 0;
   for(int i = 0; i < original.length; i++){
	  if(serch[0].equals(original[i])){
	     int j ;
	     int k = i;
	     int count = 0;
	     for(j = 0;j<serch.length;j++,k++){
	         if(k == original.length){
	        	 k = 0;
	         }
	    	 if( serch[j].equals( original[k]) ){
	        	 count++;;
	         }
	     }
	     if(count == serch.length){
	        flag = 1;
	     }
	  }
   }
   if(flag == 1){
	   System.out.println("Yes");
   }else{
	   System.out.println("No");
   }
  }
}

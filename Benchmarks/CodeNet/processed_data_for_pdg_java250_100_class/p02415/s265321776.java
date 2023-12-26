public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		        	   String strings = input.readLine();
			           String strings_words = strings;
			           char[] c=strings_words.toCharArray();
			           for(char cl: c){
			        	   String str__conversion= String.valueOf(cl);
			        	   String output="";
			        	   if(Character.isUpperCase(cl)){
			        		   output=  str__conversion.toLowerCase();
			        	   }else{
			        		    output= str__conversion.toUpperCase();
			        	   }
			        	   System.out.print(output);
			           }
  System.out.println("");
	}
}

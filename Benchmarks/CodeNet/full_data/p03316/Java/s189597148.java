import java.util.Scanner;
	public class Main {
		private static Scanner k;
	
		public static void main(String args[]){ 
			 k = new Scanner(System.in);
			 String stringToCheck= k.nextLine(); 
		        int temp = 0; 
		        int j,kr;
		        String Str;
		        kr=Integer.parseInt(stringToCheck);
		     
		  for (int i=0; i<stringToCheck.length(); i++){ 
		              
		            Str=String.valueOf(stringToCheck.charAt(i));
		            j=Integer.parseInt(Str);
		            temp=temp+j;
		     }  
		  if(kr%temp==0)System.out.println("Yes"); 
		  else {
			  System.out.println("No");
		  }
		        } 
	}
		  
import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner sc = new Scanner(System.in);
		   
		    String s = sc.nextLine();
		    String kotae = null;
		    
		    for(int i = 0; i < s.length(); i++) {
		    	if(s.substring(i, i+1).equals("B")) {
		    		if(kotae != null) {
		    			kotae = kotae.substring(0,kotae.length() - 1);
		    		}
		    	}
		    	else {
		    		kotae = kotae + s.substring(i,i + 1);
		    	}
		    }
		    System.out.println(kotae);
		    sc.close(); }
}
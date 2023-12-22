

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String S = sc.next();
	    sc.close();
	    
	    
	    int MM1= 0;
	    int MM2=0;
	   
	    
	    while (true){
	    	if (S.charAt(0)=='1'){
	    		if (S.charAt(1)=='0' || S.charAt(1)=='1' || S.charAt(1)=='2')
	    			MM1++;
	    		
	    	}	
	    	else if (S.charAt(0)=='0'){
	    		if (S.charAt(1)!='0')
	    			MM1++;
	    		
	    	}
	    	break;
	    }
	
	
	    while (true){
	    	if (S.charAt(2)=='1'){
	    		if (S.charAt(3)=='0' || S.charAt(3)=='1' || S.charAt(3)=='2')
	    			MM2++;
	    		
	    	}
	    	else if (S.charAt(2)=='0'){
	    		if (S.charAt(3)!='0')
	    				MM2++;
	    	}
	
	    	break;
	    }
	    

	    
		if (MM1==1 && MM2==1){
			System.out.println("AMBIGUOUS");
		}
		else if (MM1==1)
			System.out.println("MMYY");
		else if (MM2==1)
			System.out.println("YYMM");
		
		else
			System.out.println("NA");
	    
	}

}

import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//数値
		String str = sc.next();
		int n[] = new int[4];

        	int A = Character.getNumericValue(str.charAt(0)); 
		    int B = Character.getNumericValue(str.charAt(1)); 
		    int C = Character.getNumericValue(str.charAt(2)); 
		    int D = Character.getNumericValue(str.charAt(3)); 
		    if(A+B+C+D==7) {
		    	System.out.println(A+"+"+B+"+"+C+"+"+D+"=7");
		    	return;
		    	}
		    else if(A+B+C-D==7) {
		    	System.out.println(A+"+"+B+"+"+C+"-"+D+"=7");
		    	return;
		    	}
		    else if(A+B-C+D==7) {
		    	System.out.println(A+"+"+B+"-"+C+"+"+D+"=7");
		    	return;
		    	}
		    else if(A+B-C-D==7) {
		    	System.out.println(A+"+"+B+"-"+C+"-"+D+"=7");
		    	return;
		    	}
		    
		    else if(A-B+C+D==7) {
		    	System.out.println(A+"-"+B+"+"+C+"+"+D+"=7");
		    	return;
		    	}
		    else if(A-B+C-D==7) {
		    	System.out.println(A+"-"+B+"+"+C+"-"+D+"=7");
		    	return;
		    	}
		    else if(A-B-C+D==7) {
		    	System.out.println(A+"-"+B+"-"+C+"+"+D+"=7");
		    	return;
		    	}
		    else if(A-B-C-D==7) {
		    	System.out.println(A+"-"+B+"-"+C+"-"+D+"=7");
		    	return;
		    	}
		}
}
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//数値
		String str = sc.next();
		int n[] = new int[4];

        for(int i = 0; i < 4; i++){
        	n[i] = Character.getNumericValue(str.charAt(i)); 
        	int A = n[0];
		    int B = n[1];
		    int C = n[2];
		    int D = n[3];
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
}
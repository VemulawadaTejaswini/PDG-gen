import java.util.*;

public class A_052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt(), B=sc.nextInt(),
		    C=sc.nextInt(), D=sc.nextInt();
	    int s, n;
	    
	    s = A*B;
	    n = C*D;
	    
	    if(s>n){
	        System.out.println(s);
	    }
	    
	    else if(n>s){
	    	 System.out.println(n);
	    }
	    
	    else{
	    	 System.out.println(A*B);
	    }
	    }

	}

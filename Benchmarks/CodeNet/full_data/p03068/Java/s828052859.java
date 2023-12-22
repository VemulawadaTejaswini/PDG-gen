import java.util.*;
public class Main {
 
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int N;
	    String S;
	    int K;
	    
	    N=sc.nextInt();
	    S=sc.next();
	    K=sc.nextInt();
	    
	    char s=S.charAt(K-1);
	    
	    String ans="";
	    
	    for(int i=0;i<N;i++){
	    	if(!(S.charAt(i)==s)) {
	    		ans=ans+'*';
	    	}else {
	    		ans=ans+S.charAt(i);
	    	}
	    }
	    
	    System.out.println(ans);
	    
	    
	    
	}
 
}
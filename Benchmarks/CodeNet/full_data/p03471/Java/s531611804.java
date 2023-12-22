import java.util.*;
import java.lang.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		b=b/1000;
		int ok=0;
		int k;
	    for(int i=0;i<=a;i++) {
	    	if(ok==1)break;
	    	    for(int j=0;j<=a;j++) {
	    	    	    k=b-(10*i+5*j);
	    	    	    	    if(k>=0&&k<=b&&a==i+j+k) {
	    	    	    	    	   ok=1;
	    	    	    	    	   System.out.println(i+" "+j+" "+k);
	    	    	    	    }
	    	    	}
	    	}
		if(ok==0)System.out.println(-1+" "+-1+" "+-1);
	}
}
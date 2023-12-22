import java.util.*;

public class DigitsinMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		long N=s.nextLong();
		int F=0;
	    String a,b;
	    int i=0;
	    int min=100;
	    
	    for(i=1;i*i<=N;i++){
	    	if(N%i!=0)continue;
	    	else{
	    	a=String.valueOf(i);
	    	b=String.valueOf(N/i);
	    	if(a.length()<=b.length())F=b.length();
	    	if(a.length()>b.length())F=a.length();
	    	if(min>F)min=F;
	    	}
	    }
	    
	    System.out.print(min);

	}

}
import java.util.*;

public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count=0;
		int max =0;
	    long t1 = sc.nextLong();
	    for(int i=0;i<N-1;i++) {
	    	long t2=sc.nextLong();
	    	if(t1>=t2) count++;
	    	if(count>max )max =count;
	    	if(t1 <t2 )count=0;
	    	t1 =t2;
	    	
	    }
	    
	 
		
	   System.out.println(max);
	}
	
}


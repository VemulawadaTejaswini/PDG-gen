import java.util.*;

public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
	    long data[] =new long[N];
	    for(int i=0;i<N;i++) {
	    	data[i] =sc.nextLong();
	    }
	    int count=0;
	    int max =0;
	   for(int i=0;i<N;i++) {
		   for(int j=i;j<N-1;j++) {
			   
			   if(data[j]>=data[j+1]) {
				   count++;
			   }else {
				   break;
			   }
			   
		   }
		   if(count>max)max=count;
		   count=0;
	   }
	   System.out.println(max);
	}
	
}

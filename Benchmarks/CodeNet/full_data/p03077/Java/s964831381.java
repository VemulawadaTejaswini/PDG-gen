import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    long N=sc.nextLong();
	    
	    long time[]=new long[5];
	    time[0]=sc.nextLong();
	    time[1]=sc.nextLong();
	    time[2]=sc.nextLong();
	    time[3]=sc.nextLong();
	    time[4]=sc.nextLong();
	    
	    
	    double neck=0;
	    int num=-1;
	    
	    for(int i=0;i<5;i++) {
	    	if(neck<Math.ceil(N/time[i])) {
	    		neck=Math.ceil(N/time[i]);
	    		num=i;
	    	}
	    }
	    
	    System.out.println(String.format("%.0f", neck+(6-num)));
	}

}

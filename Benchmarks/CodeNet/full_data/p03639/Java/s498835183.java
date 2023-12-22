
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    
	    long m = 1;
	   
	    int count_4 =0;
	    int count_2=0;
	    int count_odd=0;
	    for (int i = 0; i<N; i++){
	    	m=sc.nextLong();
	    	if (m%4==0){
	    		count_4++;
	    	}
	    	else if (m%2==0){
	    		count_2++;
	    	}
	    	else 
	    		count_odd++;
	    }
	    //System.out.println(count_odd+ ": "+count_2+": "+count_4);
	    
	    if (count_odd==0)
	    	System.out.println("Yes");
	    
	    else if (count_4==0)
	    	System.out.println("Yes");
	    
	    else if (count_4+1>=count_odd)
	    	System.out.println("Yes");
	    
	    else
	    	System.out.println("No");
	}

}

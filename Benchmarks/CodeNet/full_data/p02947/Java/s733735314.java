import java.util.*; 


public class Main
 {
	public static void main (String[] args)
	 {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    in.nextLine();
	    String[] A = new String[n];
	    
	    
	    for(int i=0;i<n;i++) {
	    	A[i] = in.nextLine();
	    	
	    }
	    
	    for(int i=0;i<n;i++) {
	    	char[] stringArray = A[i].toCharArray();
	    	Arrays.sort(stringArray);
	    	A[i] = new String(stringArray);
	    }
	    
	    Arrays.sort(A);
	    long ans = 0;
	    
	    int count = 1;
	    String current = "";
	    for(int i=0;i<n;i++) {
	    	if(A[i].equals(current)) {
	    		count++;
	    		
	    		
	    	}
	    	else {
	    		ans += count*(count-1)/2;
	    		count = 1;
	    	}
	    	current = A[i];
	    	
	    }
	    ans+=count*(count-1)/2;
	   
	    System.out.println(ans);
	 }
	
	
	
	
	
	
	 

}




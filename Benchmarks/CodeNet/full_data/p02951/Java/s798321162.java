import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
	    int N = s.nextInt();
	    int anser = 0;
	    for(int i=1; i<N+1; i++) {
	    	if(String.valueOf(i).length() %2 == 1) {
	    		anser++;
	    		
	    	}
	    }
	    
	    System.out.println(anser);
		
	}
}

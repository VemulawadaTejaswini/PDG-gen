import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    int N = scanner.nextInt();
	    
	    for(int i=0;i<N;i++) {
		    int A = scanner.nextInt();
		    if(A%2==0 && A%3!=0 && A%5!=0) {
	    		System.out.println("DENIED");
	    		System.exit(0);
		    }
	    }
    	System.out.println("APPROVED");
	  
  		scanner.close();
	}

}
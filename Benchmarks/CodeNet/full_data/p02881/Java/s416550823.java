import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		 Scanner scan = new Scanner(System.in);
	     String str = scan.nextLine();
	     String[] chars = str.split(" ");
	     long N= Long.valueOf(chars[0]);
	     long M;
	     long rootN = (int)Math.sqrt(N);
	     for(long i=rootN;i>0;i--) {
	    	 if(N%i==0) {
	    		M = N/i;
	    			System.out.println(i+M-2);
	    			return;
	    	 }
	     }
	}

}

import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String S = sc.next();
    	
    	int start = 0;
    	int end = 0;
    	int ml = 0;
    	boolean flag = false;
    	for( int i = 0; i < S.length(); i++ ) {
    		char c = S.charAt(i);
    		if( (c== 'A' || c == 'C' || c == 'G' || c == 'T') && flag == false  ) {
    			start = i;
    			end = i+1;
    			flag = true;
    		}
    		else if( (c== 'A' || c == 'C' || c == 'G' || c == 'T') && flag == true && i != S.length() - 1 ) {
    			end = i+1;
    		}
    		else if( (c== 'A' || c == 'C' || c == 'G' || c == 'T') && flag == true && i == S.length() - 1 ) {
    			end = i+1;
    			int temp = end - start;
    			if( ml < temp ) {
    				ml = temp;
    			}
    		}
    		else {
    			int temp = end - start;
    			if( ml < temp ) {
    				ml = temp;
    			}
    			flag = false;
    		}
    	}
    	System.out.println( ml );
    	sc.close();
    }
}
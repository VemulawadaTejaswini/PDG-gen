import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);

        int N = stdin.nextInt();
        int flag = 0;
        
	        for(int i=1;i<10;i++) {
	        	for(int j=1;j<10;j++) {
	        		if(i*j == N) {
	        			flag = 1;
	        			break;
	        		}
	        	}
	        	if(flag == 1) break;
	        }
	    if(flag == 1) {
	    	System.out.println("Yes");
	    }
        else {
        	System.out.println("No");
        }
	}
}

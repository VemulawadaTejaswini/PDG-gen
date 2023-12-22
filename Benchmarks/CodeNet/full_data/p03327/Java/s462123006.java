import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    sc.close();
	    
	    String answer;
	    
	    if(N > 999) {
	    	answer = "ABD" + (N - 999);
	    }else {
	    	answer = "ABC" + N;
	    }
	    
	    System.out.println(answer);
	    System.exit(0);
	}
}
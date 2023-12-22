import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int A = scanner.nextInt();
	    int B = scanner.nextInt();
	    int[] answers = {1, 2, 3};
	    
	    for (int answer : answers) {
	    	if (A == answer) {
	    		continue;
	    	} else if (B == answer) {
	    		continue;
	    	} 
            System.out.println(answer);
	    }
	}	
}	
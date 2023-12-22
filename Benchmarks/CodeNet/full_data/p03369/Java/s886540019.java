import java.util.*;

public class Main {
    public static void main(String[] args) {	
	Main main = new Main();
    	main.solveA();
    }
    
    private void solveA() {
    	Scanner sc = new Scanner(System.in);
    	String s = sc.next();
	int top = 0;

	for(int i=0; i < 3; i++){
	    if (s.charAt(i) == 'o') top += 100;
	}
	
    	System.out.println(700 + top);
    }
}
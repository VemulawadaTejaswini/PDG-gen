import java.util.*;
public class Main {
    public static void main(String[] args) {	
	Main main = new Main();
    	main.solveA();
    }
    
    private void solveA() {
	Scanner sc = new Scanner(System.in);
    	int A = sc.nextInt();
    	int B = sc.nextInt();
	String s;
	if (A>=9 || B>=9){
	    s = ":(";
	}
	else{
	    s = "Yay!";
	}
    	System.out.println(s);
    }
}
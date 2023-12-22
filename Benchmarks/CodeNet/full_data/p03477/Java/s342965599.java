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
	int C = sc.nextInt();
	int D = sc.nextInt();	
    	System.out.println(A+B > C+D ? "Left" : (A+B < C+D ? "Right" : "Balanced"));
    }

    private void solveB() {
    }
    private void solveC() {
    }
    private void solveD() {
    }
}

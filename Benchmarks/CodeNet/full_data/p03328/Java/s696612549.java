import java.util.*;
 
public class Main {
    public static void main(String[] args) {	
	Main main = new Main();
    	main.solveB();
    }
    
    private void solveB() {
    	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
        int b = sc.nextInt();
        int n = b - a;
        int c = 0;

        for (int i = 0; i<= n; i++){
	    c += i;
}

    	System.out.println(c-b);
    }
}
